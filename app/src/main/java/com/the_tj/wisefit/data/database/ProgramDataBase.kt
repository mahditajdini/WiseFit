package com.the_tj.wisefit.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.the_tj.wisefit.data.model.ProgramEntity

@Database(entities = [ProgramEntity::class], version = 1, exportSchema = false)
abstract class ProgramDataBase :RoomDatabase(){
    abstract fun programDao():ProgramDao

}