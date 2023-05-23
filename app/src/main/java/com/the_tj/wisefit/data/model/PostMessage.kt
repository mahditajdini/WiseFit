package com.the_tj.wisefit.data.model

import com.google.gson.annotations.SerializedName

data class PostMessage(
    val prompt: String,
    val maxTokens: Int = 500,
    val temperature: Double = 0.8,
    val topP: Double = 1.0
)