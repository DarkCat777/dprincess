package edu.darkcat.dprincess.repository

import edu.darkcat.dprincess.model.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Isolation
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Repository
interface UserEntityRepository : JpaRepository<UserEntity, Long>, CrudRepository<UserEntity, Long> {

    @Transactional(
        propagation = Propagation.REQUIRES_NEW,
        isolation = Isolation.READ_COMMITTED
    )
    fun findByUsername(username: String): Optional<UserEntity?>

}