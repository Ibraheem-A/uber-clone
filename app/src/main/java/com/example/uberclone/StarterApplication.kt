package com.example.uberclone

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.parse.Parse
import com.parse.ParseACL
import com.parse.ParseException
import com.parse.ParseObject
import com.parse.SaveCallback

class StarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this)

        // Add your initialization code here
        Parse.initialize(Parse.Configuration.Builder(applicationContext)
                .applicationId("myappID")
                .clientKey("hCxsL9CG4krg")
                .server("http://3.70.204.147//parse/")
                .build()
        )

        //ParseUser.enableAutomaticUser()
        val defaultACL = ParseACL()
        defaultACL.publicReadAccess = true
        defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)

    }
}