package com.kelompok1.uasmobile.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

private const val BASE_URL = "https://makeup-api.herokuapp.com/api/v1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface MakeUpApiService{
    @GET
    suspend fun getDataEyebrow(@Url url: String) : List<Eyebrow>
    @GET("product.json")
    suspend fun getDataEyeliner(@Query("product_type") kategori: String) : List<Eyeliner>
<<<<<<< HEAD
    @GET("product.json")
    suspend fun getDataEyeshadow(@Query("product_type") kategori: String) : List<Eyeshadow>
=======
    @GET
    suspend fun getDataEyeshadow(@Url url: String): List<Eyeshadow>
>>>>>>> f3e4a43e7def8f73334215fc57c22b36c752cf6f
}
object MakeUpApi{
    val retrofitServiceApi : MakeUpApiService by lazy {
        retrofit.create(MakeUpApiService::class.java)
    }
}