package com.the_tj.wisefit.data.model


import com.google.gson.annotations.SerializedName

data class ResponseMessage(
    val id: String,
    val `object`: String,
    val created: Long,
    val model: String,
    val choices: List<ChatChoice>
)
