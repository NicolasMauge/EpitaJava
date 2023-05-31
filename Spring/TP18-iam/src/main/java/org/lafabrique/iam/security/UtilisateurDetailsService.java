package org.lafabrique.iam.security;

import org.lafabrique.iam.application.ClientService;
import org.lafabrique.iam.domaine.Client;
import org.lafabrique.iam.domaine.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurDetailsService implements UserDetailsService {
    @Autowired
    ClientService clientService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientService.findByEmail(username);
        if(client==null) throw new UsernameNotFoundException("Utilisateur introuvable");

        System.out.println("Dans loadUserByUsername : ");
        for (Role role: client.getRoles()) {
            System.out.println("role : "+role.getNom());
        }

        List<GrantedAuthority> authorityList = client.getRoles().stream()
                .map(role -> {return new SimpleGrantedAuthority(role.getNom());})
                .collect(Collectors.toList());

        //GrantedAuthority authority = new SimpleGrantedAuthority(client.getRoles());
        //authorityList.add(authority);

        System.out.println(" "+client.getPassword() +" " + client.getPassword() + " " + authorityList);

        return new org.springframework.security.core.userdetails.User(client.getPassword(), client.getPassword(), authorityList);

        //authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        //return new User("anais", "$2a$10$NeiWKZinvXLOf6D6KWPcG.tGZCxKmilLB9miLLtIveITIrwpBZzIe", authorityList);
    }
}
