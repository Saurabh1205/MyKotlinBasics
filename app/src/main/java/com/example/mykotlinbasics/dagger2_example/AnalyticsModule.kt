package com.example.mykotlinbasics.dagger2_example

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {
    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticService {
        return MixedPannel()
    }
}