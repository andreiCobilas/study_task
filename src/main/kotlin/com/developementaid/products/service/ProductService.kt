package com.developementaid.products.service

import com.developementaid.products.dao.ProductRepository
import com.developementaid.products.dao.model.Product
import com.developementaid.products.exceptions.ProductNotFoundException
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(val database: ProductRepository) {

    fun getAllProducts(): List<Product> = database.findAll().toList()

    fun getProductById(id: Int): Product {
        return database.findById(id).toList().find { product -> product.id ==id  }
            ?:  throw ProductNotFoundException("Product with id $id not found")
    }

    fun addProduct(product: Product) {
        database.save(product)
    }

    fun deleteProductById(id: Int) {
        if(database.findById(id).toList().isNotEmpty())
            database.deleteById(id)
        else throw ProductNotFoundException("Product with id $id not found")
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
