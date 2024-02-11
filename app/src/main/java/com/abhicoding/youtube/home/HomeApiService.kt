package com.abhicoding.youtube.home

import retrofit2.http.GET
import retrofit2.http.Header


interface HomeApiService {

    @GET("Router.IP.Address")
    suspend fun getVideos(
        @Header("home") home: String = "home"
    )
}