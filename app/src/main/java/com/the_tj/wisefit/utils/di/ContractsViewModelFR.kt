package com.the_tj.wisefit.utils.di

import androidx.fragment.app.Fragment
import com.the_tj.wisefit.ui.addprogram.AddProgramContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class ContractsViewModelFR {

    @Provides
    fun programView(fragment:Fragment): AddProgramContracts.View{
        return fragment as AddProgramContracts.View
    }
}