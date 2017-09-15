package com.vashisthg.daggertest.di

import com.vashisthg.daggertest.main.MainActivity
import com.vashisthg.daggertest.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by gauravvashisth on 15/09/17.
 */
@Module
abstract class ActivityBindingModule {
    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    internal abstract fun mainActivity(): MainActivity
}