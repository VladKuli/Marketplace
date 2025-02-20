package org.example.gateway.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public ReactiveJwtDecoder jwtDecoder() {
        return NimbusReactiveJwtDecoder.withJwkSetUri("https://your-jwk-set-uri").build();
    }

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
                .csrf(ServerHttpSecurity.CsrfSpec::disable) // Disable CSRF for APIs
                .authorizeExchange(auth -> auth
                        .pathMatchers("/auth/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll() // Public routes
                        .anyExchange().authenticated() // Protect all other routes
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt()); // Enable JWT authentication

        return http.build();
    }
}
