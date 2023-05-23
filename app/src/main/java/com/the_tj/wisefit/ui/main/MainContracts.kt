package com.the_tj.wisefit.ui.main

import com.the_tj.wisefit.base.BasePresenter
import com.the_tj.wisefit.data.model.ProgramEntity

interface MainContracts {

    interface View {
        fun showAllPrograms(programs: List<ProgramEntity>)
        fun showEmpty()
    }

    interface Presenter:BasePresenter{
        fun loadAllPrograms()
        fun searchProgram(title:String)
    }

}