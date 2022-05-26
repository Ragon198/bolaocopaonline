package com.bolaocopaonline.bolaocopaonline.integration.data.service

import com.bolaocopaonline.bolaocopaonline.integration.data.models.User
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import java.util.*

interface UserService {
    fun create(user: User): User

    fun getAll(): List<User>

    fun getById(id: Long) : Optional<User>

    fun update(@PathVariable id: Long, @RequestBody user: User) : Optional<User>

    fun delete(@PathVariable id: Long)
}