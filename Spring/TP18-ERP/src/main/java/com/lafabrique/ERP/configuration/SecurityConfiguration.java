package com.lafabrique.ERP.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/v1/").hasRole("ADMIN");
        http.authorizeRequests().anyRequest().permitAll();
        // ajouter d'autres autorisations sur les autres pages
        // http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/v1/hello/admin/getAdminHello").hasRole("ADMIN");
        http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
        http.csrf().disable();
        http.formLogin().disable();
        return http.build();
    }
}
