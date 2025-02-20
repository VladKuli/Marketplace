# 🛍️ Microservices Marketplace

## 📌 Overview
This project is a fully scalable **microservices-based marketplace**, leveraging modern technologies for authentication, product management, ordering, payments, notifications, and more.

### 🎯 Key Features
- **API Gateway** (Spring Cloud Gateway) → Request routing & authentication
- **Authentication Service** (Spring Security + JWT + OAuth2)
- **User Management** (Spring Boot + PostgreSQL)
- **Product Service** (Spring Boot + PostgreSQL + Elasticsearch) → Search-enabled product catalog
- **Order Processing** (Spring Boot + Kafka) → Async order handling
- **Payment Service** (Spring Boot + Stripe API) → Secure transactions
- **Notification Service** (Spring Boot + Kafka + WebSockets) → Real-time alerts
- **Review Analysis** (Spring Boot + AI) → Sentiment analysis with OpenAI API / Hugging Face

## 🏗 Architecture
The marketplace follows a **distributed microservices** architecture:

```
marketplace-microservices/
│── api-gateway/              # API Gateway (Spring Cloud Gateway)
│── auth-service/             # Authentication & security (JWT, OAuth2)
│── user-service/             # User profile management
│── product-service/          # Product catalog with Elasticsearch
│── order-service/            # Order processing (Kafka + PostgreSQL)
│── payment-service/          # Payment integration (Stripe API)
│── notification-service/     # User notifications (Kafka + WebSockets)
│── review-service/           # AI-based review analysis (GraphQL API)
│── common-library/           # Shared DTOs & security modules
│── config-server/            # Centralized configuration (Spring Cloud Config)
│── docker-compose.yml        # Dockerized deployment setup
│── k8s/                      # Kubernetes manifests for cloud deployment
│── README.md                 # Project documentation
```

## 🛠 Tech Stack
### **Backend**
- **Spring Boot 3** (Java 21) → Core framework
- **Spring Cloud** (Eureka, API Gateway, Config Server) → Service discovery & config management
- **Spring Security + JWT + OAuth2** → Authentication & authorization
- **PostgreSQL + Redis + Elasticsearch** → Data storage & caching
- **Kafka / RabbitMQ** → Asynchronous messaging
- **Stripe API / YooMoney / Tinkoff** → Payment processing
- **GraphQL API** → Efficient review querying

### **DevOps & Deployment**
- **Docker + Kubernetes** → Containerized cloud deployment
- **GitHub Actions + Terraform** → CI/CD pipeline
- **WebSockets** → Real-time notifications

## 🔥 Why This Project?
✅ **Real-world microservices architecture** → Showcases distributed systems expertise.  
✅ **Advanced tech stack** → Kafka, WebSockets, AI, OAuth2, GraphQL.  
✅ **Cloud-ready** → Docker & Kubernetes support for scalable deployment.  

## About Me
I am Vladislav Kulikov, a beginner Java Software Developer looking for a job. Passionate about building high-performance applications and sharing knowledge with the developer community.

### Contact Information
📧 Email: vladislav.kulikov.official@gmail.com
