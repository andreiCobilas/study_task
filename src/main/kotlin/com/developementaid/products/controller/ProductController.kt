package com.developementaid.products.controller

import com.developementaid.products.dao.model.Product
import com.developementaid.products.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
class ProductController(val service: ProductService) {

    @GetMapping("/")
    fun default(): String = "Log-in"

    @PostMapping("/product")
    fun post(@RequestBody product : Product) {
        service.addProduct(product)
    }

    @GetMapping("/product/{id}")
    fun index(@PathVariable id: Int): List<Product> =
        service.getProductById(id)

    @DeleteMapping("/product/{id}")
    fun delete(@PathVariable id: Int){
        service.deleteProductById(id)
    }
}