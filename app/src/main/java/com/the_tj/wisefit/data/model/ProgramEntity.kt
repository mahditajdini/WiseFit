package com.the_tj.wisefit.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.the_tj.wisefit.utils.PROGRAM_TABLE

@Entity(tableName = PROGRAM_TABLE)
data class ProgramEntity(

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    //user information
    var height: Int=0,
    var weight: Int=0,
    var gender: String="",
    var age: Int=0,
    var dietType: String="",
    var lifestyle: String="",
    var mobilityAverage: Int=0,
    var programDays: Int=0,
    var workoutTime: Int=0,

    //program information
    var title: String="",
    var sportProgram: String="",
    var diet: String="",
    var recommendation: String="",

    //subscription plan
    var coupons: String=""

)





