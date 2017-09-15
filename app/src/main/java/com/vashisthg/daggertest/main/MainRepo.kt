package com.vashisthg.daggertest.main

import com.vashisthg.daggertest.di.PerActivity

/**
 * Created by gauravvashisth on 16/09/17.
 */
@PerActivity
class MainRepo {

    fun getData(): String {
        return "main data"
    }

}