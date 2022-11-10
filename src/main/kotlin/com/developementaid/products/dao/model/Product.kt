package com.developementaid.products.dao.model

import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Table("MESSAGES")
data class Product(@Id var id: Int?, val text: String)