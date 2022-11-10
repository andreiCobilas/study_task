package com.developementaid.products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@SpringBootApplication
class ProductsApplication

fun main(args: Array<String>) {
	runApplication<ProductsApplication>(*args)
}
