package edu.darkcat.dprincess.model.entity

import org.springframework.data.jpa.domain.AbstractPersistable
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
class UserEntity(
    @OneToMany
    private val authorities: MutableCollection<GrantedAuthorityEntity>,
    private var password: String,
    private var username: String,
    private var isAccountNonExpired: Boolean,
    private var isAccountNonLocked: Boolean,
    private var isCredentialsNonExpired: Boolean,
    private var isEnabled: Boolean
) : AbstractPersistable<Long>(), UserDetails, Serializable {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = this.authorities

    override fun getPassword(): String = this.password

    override fun getUsername(): String = this.username

    override fun isAccountNonExpired(): Boolean = this.isAccountNonExpired

    override fun isAccountNonLocked(): Boolean = this.isAccountNonLocked

    override fun isCredentialsNonExpired(): Boolean = this.isCredentialsNonExpired

    override fun isEnabled(): Boolean = this.isEnabled

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserEntity

        if (authorities != other.authorities) return false
        if (password != other.password) return false
        if (username != other.username) return false
        if (isAccountNonExpired != other.isAccountNonExpired) return false
        if (isAccountNonLocked != other.isAccountNonLocked) return false
        if (isCredentialsNonExpired != other.isCredentialsNonExpired) return false
        if (isEnabled != other.isEnabled) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + authorities.hashCode()
        result = 31 * result + password.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + isAccountNonExpired.hashCode()
        result = 31 * result + isAccountNonLocked.hashCode()
        result = 31 * result + isCredentialsNonExpired.hashCode()
        result = 31 * result + isEnabled.hashCode()
        return result
    }

}