package com.kelompok1.uasmobile.network

import com.squareup.moshi.Json

data class Eyebrow(
    @Json(name = "api_featured_image")
    val apiFeaturedImage: String?,
    @Json(name = "brand")
    val brand: String?,
    @Json(name = "category")
    val category: String?,
    @Json(name = "created_at")
    val createdAt: String?,
    @Json(name = "currency")
    val currency: String?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "id")
    val id: Int,
    @Json(name = "image_link")
    val imageLink: String?,
    @Json(name = "name")
    val name: String,
    @Json(name = "price")
    val price: String?,
    @Json(name = "price_sign")
    val priceSign: String?,
    @Json(name = "product_api_url")
    val productApiUrl: String?,
    @Json(name = "product_colors")
    val productColors: List<Any>?,
    @Json(name = "product_link")
    val productLink: String?,
    @Json(name = "product_type")
    val productType: String?,
    @Json(name = "rating")
    val rating: Any?,
    @Json(name = "tag_list")
    val tagList: List<Any>?,
    @Json(name = "updated_at")
    val updatedAt: String?,
    @Json(name = "website_link")
    val websiteLink: String?
)