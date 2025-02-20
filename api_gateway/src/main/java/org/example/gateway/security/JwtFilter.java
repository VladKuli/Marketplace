package org.example.gateway.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtException;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class JwtFilter implements WebFilter {

    private final JwtDecoder jwtDecoder;

    public JwtFilter(JwtDecoder jwtDecoder) {
        this.jwtDecoder = jwtDecoder;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        String token = exchange.getRequest().getHeaders().getFirst("Authorization");
        if (token != null && token.startsWith("Bearer ")) {
            token = token.replace("Bearer ", "");
            try {
                var jwt = jwtDecoder.decode(token);
                var authentication = new UsernamePasswordAuthenticationToken(jwt.getSubject(), null, null);
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } catch (JwtException e) {
                return Mono.empty(); // Invalid JWT, continue without authentication
            }
        }
        return chain.filter(exchange);
    }
}
