package com.example.learnroomkotlin.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    fun getPosts(): Call<MutableList<PostModel>>

}