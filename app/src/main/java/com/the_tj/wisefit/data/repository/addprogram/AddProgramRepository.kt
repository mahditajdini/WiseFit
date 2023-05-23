package com.the_tj.wisefit.data.repository.addprogram

import com.the_tj.wisefit.data.database.ProgramDao
import com.the_tj.wisefit.data.model.PostMessage
import com.the_tj.wisefit.data.model.ProgramEntity
import com.the_tj.wisefit.data.server.OpenAiService
import javax.inject.Inject

class AddProgramRepository @Inject constructor(private val api : OpenAiService, private val dao: ProgramDao) {

    fun saveProgram(entity: ProgramEntity) = dao.saveProgram(entity)
    fun detailProgram(id: Int) = dao.getProgram(id)
    fun updateProgram(entity: ProgramEntity) = dao.updateProgram(entity)
    fun getCompletion(postMessage: PostMessage)=api.getCompletion(postMessage)

}