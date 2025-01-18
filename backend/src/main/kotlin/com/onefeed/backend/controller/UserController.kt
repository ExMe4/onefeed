package com.onefeed.backend.controller

import org.springframework.security.oauth2.core.user.OAuth2User
import com.onefeed.backend.model.User
import com.onefeed.backend.repository.UserRepository
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(val userRepository: UserRepository) {

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userRepository.save(user)
    }

    @GetMapping("/{email}")
    fun getUserByEmail(@PathVariable email: String): User? {
        return userRepository.findByEmail(email)
    }

    @GetMapping("/user")
    fun getUser(@AuthenticationPrincipal user: OAuth2User): Map<String, Any> {
        return user.attributes
    }
}
