package edu.darkcat.dprincess.model.entity

import org.springframework.data.jpa.domain.AbstractAuditable
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "client")
class ClientEntity(
    var name: String,
    var lastName: String
) : AbstractAuditable<UserEntity, Long>()