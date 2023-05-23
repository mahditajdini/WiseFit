package com.the_tj.wisefit.utils

import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import com.google.android.material.snackbar.Snackbar
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

const val PROGRAM_TABLE = "program_table"
const val PROGRAM_DATABASE = "program_database"
const val BASE_URL = "https://api.openai.com/v1/"
const val NETWORK_TIMEOUT = 60L