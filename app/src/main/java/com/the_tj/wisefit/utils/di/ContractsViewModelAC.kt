package com.the_tj.wisefit.utils.di

import android.app.Activity
import com.the_tj.wisefit.ui.main.MainContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ContractsViewModelAC {

    @Provides
    fun mainView(activity:Activity):MainContracts.View{
        return activity as MainContracts.View
    }
}