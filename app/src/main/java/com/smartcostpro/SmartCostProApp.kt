package com.smartcostpro

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application entry point.
 * Hilt is enabled for future DI (Foundation 2+).
 * No secrets, no network configuration here.
 */
@HiltAndroidApp
class SmartCostProApp : Application()
