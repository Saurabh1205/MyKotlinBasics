package com.example.mykotlinbasics.jetpack_archi_compo.viewmodel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mykotlinbasics.R

/*Using ViewModel and ViewModelFactory
* we are crating a Offline Json Quote App to Understanding of ViewModel and ViewModelFactory concepts
* we have a Json of Quotes
* also We have a View in the form of XML
* so Using this we can create a small application with static Data
* */


class QuoteActivity : AppCompatActivity() {
    private val quoteText : TextView
    get() = findViewById(R.id.quoteText)

    private val quoteAuthor : TextView
    get() = findViewById(R.id.quoteAuthor)

    lateinit var quoteViewModel: QuoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quote)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        quoteViewModel = ViewModelProvider(this, QuoteViewModelFactory(application)).get(QuoteViewModel::class.java)
        setQuote(quoteViewModel.getQuoteList())

    }

    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, quoteViewModel.getQuoteList().text)
        startActivity(intent)
    }
    fun onNext(view: View) {
        setQuote(quoteViewModel.nextQuote())
    }
    fun onPrevious(view: View) {
        setQuote(quoteViewModel.previousQuote())
    }
    private fun setQuote(quote: Quote) {
        quoteText.text = quote.text
        quoteAuthor.text = quote.author

    }

}