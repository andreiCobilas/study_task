package com.developementaid.products.dao

import com.developementaid.products.dao.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product, Int>