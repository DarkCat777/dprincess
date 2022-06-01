package edu.darkcat.dprincess.config

import edu.darkcat.dprincess.repository.UserEntityRepository
import org.springframework.data.domain.AuditorAware
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Component
import java.util.*

@Component
class AuditorAwareImpl(
    private val userRepository: UserEntityRepository
) : AuditorAware<User> {

    override fun getCurrentAuditor(): Optional<User> {
        val username = SecurityContextHolder.getContext().authentication.name
        return userRepository.findByUsername(username).map {
            if (it == null) User("anonymous", "anonymous", listOf())
            else User(it.username, it.password, it.authorities)
        }
    }
}