package com.haydar.practicegetapi.network

import com.haydar.practicegetapi.data.UserItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getListUser() : Call<ArrayList<UserItem>>
}