package com.the_tj.wisefit.utils.di

import android.content.Context
import androidx.room.Room
import com.the_tj.wisefit.data.database.ProgramDataBase
import com.the_tj.wisefit.data.model.ProgramEntity
import com.the_tj.wisefit.utils.PROGRAM_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext contex:Context) = Room.databaseBuilder(
        contex,ProgramDataBase::class.java, PROGRAM_DATABASE
    ).allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build()
    @Provides
    @Singleton
    fun provideDao(db: ProgramDataBase) = db.programDao()

    @Provides
    @Singleton
    fun provideEntity() = ProgramEntity()
}