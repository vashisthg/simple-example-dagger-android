package com.vashisthg.library

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by gauravvashisth
 */

@Module
abstract class LibraryModule {

    @LibraryScope
    @ContributesAndroidInjector(modules = arrayOf(LibraryRepoModule::class))
    internal abstract fun libraryActivity(): LibraryActivity
}