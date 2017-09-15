package com.vashisthg.daggertest.main

import com.vashisthg.daggertest.di.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by gauravvashisth on 15/09/17.
 */
@Module
class MainModule {

    @PerActivity
    @Provides
    fun providesString(): MainRepo {
        return MainRepo()
    }
}