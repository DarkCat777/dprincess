package edu.darkcat.dprincess.model.entity

import org.springframework.data.jpa.domain.AbstractPersistable
import org.springframework.security.core.GrantedAuthority
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "granted_authority")
open class GrantedAuthorityEntity(
    private var authority: String
) : AbstractPersistable<Long>(), GrantedAuthority, Serializable {

    override fun getAuthority(): String {
        return this.authority
    }

}