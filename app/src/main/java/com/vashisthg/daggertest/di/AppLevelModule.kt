package com.vashisthg.daggertest.di

import dagger.Module
import dagger.Provides

/**
 * Created by gauravvashisth on 15/09/17.
 */
@Module
class AppLevelModule {
    @Provides
    fun providesString(): String {
        return "This is text from app level module"
    }
}