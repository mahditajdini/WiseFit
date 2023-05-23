package com.the_tj.wisefit.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.the_tj.wisefit.data.model.ProgramEntity
import com.the_tj.wisefit.utils.PROGRAM_TABLE
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

@Dao
interface ProgramDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveProgram(ProgramEntity: ProgramEntity): Completable

    @Delete
    fun deleteProgram(ProgramEntity: ProgramEntity): Completable

    @Update
    fun updateProgram(ProgramEntity: ProgramEntity): Completable

    @Query("SELECT * FROM $PROGRAM_TABLE")
    fun getAllPrograms(): Observable<List<ProgramEntity>>

    @Query("SELECT * FROM $PROGRAM_TABLE WHERE id == :id")
    fun getProgram(id: Int): Observable<ProgramEntity>


    @Query("SELECT * FROM $PROGRAM_TABLE WHERE title LIKE '%' || :title || '%' ")
    fun searchProgram(title: String): Observable<List<ProgramEntity>>

}