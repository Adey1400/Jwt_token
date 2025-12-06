package com.example.JWT_TOKEN.User;


import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

    private final User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    // 🔹 Authorities / roles
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // if you have just one role as String in your entity
       return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));


    }

    // 🔹 Password & username mapping
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    // 🔹 Account status flags (for now everything true)
    @Override
    public boolean isAccountNonExpired() {
        return true; // change if you add "accountExpired" field
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // change if you add "accountLocked" field
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // change if you add "credentialsExpired" field
    }

    @Override
    public boolean isEnabled() {
        return true; // change if you add "enabled" field
    }

    // optional getter to access underlying User entity
    public User getUser() {
        return user;
    }
}
