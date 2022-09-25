package com.muratcay.ecommerceapp.di

import com.muratcay.ecommerceapp.data.repository.ProductRepository
import com.muratcay.ecommerceapp.data.service.ProductsService
import com.muratcay.ecommerceapp.domain.repository.ProductRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideProductRepository(productsService: ProductsService): ProductRepository {
        return ProductRepositoryImpl(productsService = productsService)
    }
}