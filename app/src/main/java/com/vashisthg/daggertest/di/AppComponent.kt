package com.vashisthg.daggertest.di

import android.app.Application
import com.vashisthg.daggertest.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

/**
 * Created by gauravvashisth
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        AppLevelModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class)
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

}