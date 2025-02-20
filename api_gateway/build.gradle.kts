plugins {
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("jvm") version "1.8.0"
    kotlin("plugin.spring") version "1.8.0"
}

repositories {
    mavenCentral()
}

dependencies {
    // Core dependencies
    implementation("org.springframework.boot:spring-boot-starter-webflux") // Required for WebFlux
    implementation("org.springframework.cloud:spring-cloud-starter-gateway") // API Gateway
    implementation("org.springframework.boot:spring-boot-starter-security") // Spring Security
    implementation("org.springframework.security:spring-security-oauth2-jose") // OAuth2 and JWT support

    // Additional dependencies
    implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive") // Rate limiting using Redis
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin") // JSON support for Kotlin
    implementation("org.springframework.boot:spring-boot-starter-validation") // Input validation
    implementation("org.springframework.cloud:spring-cloud-starter-config") // Spring Cloud Config

    // Swagger / OpenAPI (for WebFlux)
    implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.0.2")

    // Testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

// Importing Spring Cloud BOM for version management
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2022.0.1") // Spring Cloud 2022.x
    }
}
