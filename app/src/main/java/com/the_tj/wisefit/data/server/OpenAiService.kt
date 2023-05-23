package com.the_tj.wisefit.data.server

import com.the_tj.wisefit.data.model.PostMessage
import com.the_tj.wisefit.data.model.ResponseMessage
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface OpenAiService {
    @POST("completions")
    fun getCompletion(@Body request: PostMessage): Single<Response<ResponseMessage>>


}