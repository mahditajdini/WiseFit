package com.the_tj.wisefit.ui.addprogram

import com.the_tj.wisefit.base.BasePresenter
import com.the_tj.wisefit.data.model.ProgramEntity

interface AddProgramContracts {

    interface View {
        fun close()
        fun loadProgram(program: ProgramEntity)
    }

    interface Presenter : BasePresenter {

        fun saveProgram(entity: ProgramEntity)
        fun callDetailProgram(id: Int)
        fun updateProgram(entity: ProgramEntity)

    }
}