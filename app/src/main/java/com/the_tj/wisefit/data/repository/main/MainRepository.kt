package com.the_tj.wisefit.data.repository.main

import com.the_tj.wisefit.data.database.ProgramDao
import com.the_tj.wisefit.data.model.ProgramEntity
import javax.inject.Inject

class MainRepository @Inject constructor(private val dao: ProgramDao) {
    fun loadAllPrograms() = dao.getAllPrograms()
    fun deleteProgram(entity: ProgramEntity) = dao.deleteProgram(entity)
    fun searchProgram(title: String) = dao.searchProgram(title)
}