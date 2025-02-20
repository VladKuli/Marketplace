package org.example.gateway.security.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                // Auth Service
                .route("auth-service", r -> r.path("/auth/**")
                        .uri("http://localhost:8081")) // Change to your Auth Service URL

                // User Service
                .route("user-service", r -> r.path("/users/**")
                        .uri("http://localhost:8082"))

                // Product Service
                .route("product-service", r -> r.path("/products/**")
                        .uri("http://localhost:8083"))

                // Order Service
                .route("order-service", r -> r.path("/orders/**")
                        .uri("http://localhost:8084"))

                .build();
    }
}
