package com.mainpackage.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
class StarterSecurityConfig
{
    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        //we provide user/pass here, so spring boot will not use the user/pass from the application.properties file

        UserDetails aman = User.builder()
                .username("aman")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails manohar = User.builder()
                .username("manohar")
                .password("{noop}test123")
                .roles("MANAGER")
                .build();

        UserDetails jagan = User.builder()
                .username("jagan")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(aman, manohar, jagan);

    }

}
