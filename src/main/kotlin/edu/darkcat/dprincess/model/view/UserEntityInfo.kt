package edu.darkcat.dprincess.model.view

import org.springframework.security.core.GrantedAuthority

interface UserEntityInfo {
    val id: Long?
    val authorities: MutableCollection<MutableCollection<out GrantedAuthority>>
    val password: String?
    val username: String?
    val isAccountNonExpired: Boolean?
    val isAccountNonLocked: Boolean?
    val isCredentialsNonExpired: Boolean?
    val isEnabled: Boolean?
}