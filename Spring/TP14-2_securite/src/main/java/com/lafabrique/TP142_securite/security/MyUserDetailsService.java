package com.lafabrique.TP142_securite.security;

import com.lafabrique.TP142_securite.application.MyUserService;
import com.lafabrique.TP142_securite.domaine.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    MyUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser user = userService.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException("Utilisateur introuvable!");

        List<GrantedAuthority> auths = new ArrayList<>();

        GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
        auths.add(authority);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), auths);
    }

}

