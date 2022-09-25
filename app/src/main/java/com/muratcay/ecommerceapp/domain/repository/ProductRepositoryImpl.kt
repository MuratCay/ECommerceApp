package com.muratcay.ecommerceapp.domain.repository

import com.muratcay.ecommerceapp.data.repository.ProductRepository
import com.muratcay.ecommerceapp.data.service.ProductsService
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productsService: ProductsService
) : ProductRepository {
}