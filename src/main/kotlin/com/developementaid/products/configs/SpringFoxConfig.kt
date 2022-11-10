package com.developementaid.products.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import java.util.*


@Configuration
class SpringFoxConfig {
    private fun apiInfo(): ApiInfo? {
        return ApiInfo(
            "Simple WebService",
            "Simple web service that adds/deletes/gets a product",
            "1",
            "Terms of service",
            Contact("Lorem Ipsum", "lorem_ipsum.com", "myeaddress@company.com"),
            "License of API",
            "API license URL",
            Collections.emptyList()
        )
    }

    @Bean
    fun api(): Docket? {
        return Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
    }

}
