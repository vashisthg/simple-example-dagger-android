package com.vashisthg.library

import dagger.Module
import dagger.Provides

/**
 * Created by gauravvashisth on 16/09/17.
 */

@Module
class LibraryRepoModule {
    @LibraryScope
    @Provides
    fun providesRepo(): LibraryRepo {
        return LibraryRepo()
    }
}
