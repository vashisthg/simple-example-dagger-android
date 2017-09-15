package com.vashisthg.library

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.android.AndroidInjection
import javax.inject.Inject

class LibraryActivity : AppCompatActivity() {

    @Inject lateinit var libraryRepo: LibraryRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        AndroidInjection.inject(this)
        (findViewById<TextView>(R.id.from_library_module) as TextView).text = libraryRepo.getLibraryData()
    }
}
