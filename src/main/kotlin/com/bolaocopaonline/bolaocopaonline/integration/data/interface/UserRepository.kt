package com.bolaocopaonline.bolaocopaonline.integration.data.`interface`

import com.bolaocopaonline.bolaocopaonline.integration.data.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findByEmail(email: String): User

    fun getUserById(id: Long): User {
        val users: List<User> = emptyList()

        return users.stream().filter { u ->
            u.id == id
        }.findFirst().get()
    }
}