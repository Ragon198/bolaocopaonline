package com.bolaocopaonline.bolaocopaonline.integration.data.models

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "boloes")
data class Bolao(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field:NotNull
    @field:Size(min = 2, max = 20)
    val name: String,

    @field:OneToMany(fetch = FetchType.LAZY, mappedBy = "bolao")
    val userBoloes: List<UserBolao>,

    @field:OneToMany(fetch = FetchType.LAZY, mappedBy = "bolao")
    val bolaoMatches: List<BolaoMatch>
)