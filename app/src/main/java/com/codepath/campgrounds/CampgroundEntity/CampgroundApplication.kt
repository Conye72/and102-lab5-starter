package com.codepath.campgrounds

import android.app.Application
import com.codepath.campgrounds.CampgroundEntity.AppDatabase

class CampgroundApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}