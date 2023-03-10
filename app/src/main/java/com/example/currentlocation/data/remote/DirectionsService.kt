package com.example.currentlocation.data.remote

import com.example.currentlocation.BuildConfig
import com.example.currentlocation.model.Route
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface DirectionsService {
    @GET("json")
    fun getRoute(
        @Query("origin") myLocation: String,
        @Query("destination") destination: String
    ): Single<Route>
}