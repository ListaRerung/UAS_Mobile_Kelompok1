package com.kelompok1.uasmobile

import com.kelompok1.uasmobile.network.Eyebrow
import com.kelompok1.uasmobile.network.Eyeliner
import com.kelompok1.uasmobile.network.Eyeshadow
import com.kelompok1.uasmobile.network.MakeUpApi

class MakeUpRepository {
    suspend fun getDataEyebrow(): List<Eyebrow> {
        return MakeUpApi.retrofitServiceApi.getDataEyebrow("https://makeup-api.herokuapp.com/api/v1/products.json?product_type=eyebrow")
    }
    suspend fun getDataEyeliner(): List<Eyeliner> {
        return MakeUpApi.retrofitServiceApi.getDataEyeliner("https://makeup-api.herokuapp.com/api/v1/products.json?product_type=eyeliner")
    }
    suspend fun getDataEyeshadow(): List<Eyeshadow> {
        return MakeUpApi.retrofitServiceApi.getDataEyeshadow("https://makeup-api.herokuapp.com/api/v1/products.json?product_type=eyeshadow")
    }
}