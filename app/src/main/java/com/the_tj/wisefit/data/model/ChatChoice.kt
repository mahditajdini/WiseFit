package com.the_tj.wisefit.data.model

data class ChatChoice(
    val message: ChatMessage,
    val finish_reason: String,
    val index: Int
)
