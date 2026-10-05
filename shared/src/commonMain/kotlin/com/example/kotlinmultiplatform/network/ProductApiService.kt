package com.example.kotlinmultiplatform.network

import com.example.kotlinmultiplatform.model.Product
import com.example.kotlinmultiplatform.model.ProductsResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import org.koin.core.annotation.Single

@Single
class ProductApiService(
    private val client: HttpClient
) {
    suspend fun getProducts(): List<Product> {
        val response: ProductsResponse = client.get("products").body()
        return response.products.orEmpty().filterNotNull()
    }
}
