package com.example.kotlinmultiplatform.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

typealias Product = ProductsItem

@Serializable
data class ProductsResponse(

    @SerialName("total")
    val total: Int? = null,

    @SerialName("limit")
    val limit: Int? = null,

    @SerialName("skip")
    val skip: Int? = null,

    @SerialName("products")
    val products: List<Product?>? = null
)

@Serializable
data class Meta(

    @SerialName("createdAt")
    val createdAt: String? = null,

    @SerialName("qrCode")
    val qrCode: String? = null,

    @SerialName("barcode")
    val barcode: String? = null,

    @SerialName("updatedAt")
    val updatedAt: String? = null
)

@Serializable
data class ReviewsItem(

    @SerialName("date")
    val date: String? = null,

    @SerialName("reviewerName")
    val reviewerName: String? = null,

    @SerialName("reviewerEmail")
    val reviewerEmail: String? = null,

    @SerialName("rating")
    val rating: Int? = null,

    @SerialName("comment")
    val comment: String? = null
)

@Serializable
data class ProductsItem(

    @SerialName("thumbnail")
    val thumbnail: String? = null,

    @SerialName("images")
    val images: List<String?>? = null,

    @SerialName("minimumOrderQuantity")
    val minimumOrderQuantity: Int? = null,

    @SerialName("rating")
    val rating: Double? = null,

    @SerialName("returnPolicy")
    val returnPolicy: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("weight")
    val weight: Double? = null,

    @SerialName("warrantyInformation")
    val warrantyInformation: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("tags")
    val tags: List<String?>? = null,

    @SerialName("discountPercentage")
    val discountPercentage: Double? = null,

    @SerialName("reviews")
    val reviews: List<ReviewsItem?>? = null,

    @SerialName("price")
    val price: Double? = null,

    @SerialName("meta")
    val meta: Meta? = null,

    @SerialName("shippingInformation")
    val shippingInformation: String? = null,

    @SerialName("id")
    val id: Int? = null,

    @SerialName("availabilityStatus")
    val availabilityStatus: String? = null,

    @SerialName("category")
    val category: String? = null,

    @SerialName("stock")
    val stock: Int? = null,

    @SerialName("sku")
    val sku: String? = null,

    @SerialName("brand")
    val brand: String? = null,

    @SerialName("dimensions")
    val dimensions: Dimensions? = null
)

@Serializable
data class Dimensions(

    @SerialName("depth")
    val depth: Double? = null,

    @SerialName("width")
    val width: Double? = null,

    @SerialName("height")
    val height: Double? = null
)
