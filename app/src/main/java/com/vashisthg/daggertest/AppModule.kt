package com.vashisthg.daggertest

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by gauravvashisth
 */
@Module
abstract class AppModule {
    @Binds
    internal abstract fun bindContext(application: Application): Context
}