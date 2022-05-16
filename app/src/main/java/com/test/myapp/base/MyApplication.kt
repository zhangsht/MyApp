package com.test.myapp.base

import android.app.Application

/**
 * 描述：
 *
 * @author n10029
 * 日期 22/5/16 14:27
 */
class MyApplication : Application() {

    val appComponent = DaggerApplicationGraph.create()
}