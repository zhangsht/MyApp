package com.test.myapp.dagger

import android.util.Log
import javax.inject.Inject

@FragmentScope
class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {


    fun log() {
        Log.i("dagger", "UserRepository")
    }
}
