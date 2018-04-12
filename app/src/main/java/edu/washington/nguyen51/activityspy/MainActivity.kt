package edu.washington.nguyen51.activityspy

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "Main Activity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "on $TAG event fired" + intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down, Captain!")
    }
}
