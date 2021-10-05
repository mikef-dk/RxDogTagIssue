package com.mikef.rxdogtagissue

import android.app.Application
import com.uber.rxdogtag.RxDogTag

class DogTagApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // installs RxDogTag to better visualize RX-errors
        RxDogTag.install()
    }

}