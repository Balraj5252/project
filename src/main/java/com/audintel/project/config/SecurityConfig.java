package com.audintel.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.List;
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
    @Bean
    public SecurityWebFilterChain filterChain(ServerHttpSecurity http ) throws Exception {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        List<String> allowedHeaders = new java.util.ArrayList<>();
        allowedHeaders.add("Authorization");
        allowedHeaders.add("Cache-Control");
        allowedHeaders.add("Content-Type");
        corsConfiguration.setAllowedHeaders(allowedHeaders);
        List<String> allowedOrigins = new java.util.ArrayList<>();
        allowedOrigins.add("*");
        corsConfiguration.setAllowedOrigins(allowedOrigins);
        List<String> allowedMethods = new java.util.ArrayList<>();
        allowedMethods.add("GET");
        allowedMethods.add("POST");
        allowedMethods.add("PUT");
        allowedMethods.add("DELETE");
        allowedMethods.add("PUT");
        allowedMethods.add("OPTIONS");
        allowedMethods.add("PATCH");
        allowedMethods.add("DELETE");
        corsConfiguration.setAllowedMethods(allowedMethods);
        corsConfiguration.setAllowCredentials(true);
        List<String> exposedHeaders = new java.util.ArrayList<>();
        exposedHeaders.add("Authorization");
        corsConfiguration.setExposedHeaders(exposedHeaders);

        http
                .authorizeExchange()
                .pathMatchers("/test/**").permitAll()
                .pathMatchers("/user/**").permitAll()
                .anyExchange().authenticated()
                .and()
                .httpBasic().and()
                .formLogin();
        return http.build();
    }
}
