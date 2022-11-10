package com.developementaid.products.service

import com.developementaid.products.dao.ProductRepository
import com.developementaid.products.dao.model.Product
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(val db: ProductRepository) {

    fun getAllProducts(): List<Product> = db.findAll().toList()

    fun getProductById(id: Int): List<Product> = db.findById(id).toList()

    fun addProduct(product: Product) {
        db.save(product)
    }

    fun deleteProductById(id: Int) {
        db.deleteById(id)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
