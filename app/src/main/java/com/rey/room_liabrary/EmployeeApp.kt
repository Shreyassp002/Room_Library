package com.rey.room_liabrary

import android.app.Application

class EmployeeApp: Application() {
    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }
}