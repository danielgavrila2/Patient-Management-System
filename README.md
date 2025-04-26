# Patient Management System

## Description 🏥

The Patient Management System is a backend platform designed to efficiently manage patient information in a healthcare setting.  
This project aims to solve complex problems in the medical domain by offering a scalable, secure, and fast microservices-based architecture.

**Key Features:**
- Full **CRUD** (Create, Read, Update, Delete) operations for patient records.
- **Secure** and **scalable** microservices architecture.
- **Real-time communication** between services using Kafka and gRPC.
- **Cloud-ready deployment** using Docker and Infrastructure as Code (IaC).

---

## Technologies Used 💻

- **Java Spring Boot** — Backend framework for building microservices.
- **Spring Security** — Secure authentication and authorization mechanisms.
- **Hibernate** — ORM tool for database operations.
- **REST API** — For exposing endpoints during the first phase.
- **gRPC and Protobuf** — High-performance communication between Patient and Billing services.
- **Apache Kafka** — Event-driven communication between services.
- **Docker** — Containerization of each microservice.
- **AWS & LocalStack** — Cloud deployment and emulation.
- **Infrastructure as Code (IaC)** — Automated infrastructure provisioning.

---

## Architecture 🏗️

- **Microservices Architecture** — Six independent services communicating via Kafka messages and gRPC requests.
- **Containerized Deployment** — Each service is packaged as a Docker container for seamless deployment.
- **Cloud Infrastructure** — Built from scratch using IaC principles and deployed to AWS (tested with LocalStack emulator).
- **Authentication & Authorization** — JWT tokens and Spring Security implemented to protect all microservices.
- **Scalability** — Designed to easily scale horizontally by adding more instances of services.

---

## Deployment ☁️

- **Local Development**:
  - Used **LocalStack** to emulate AWS services locally.
  - Docker Compose orchestrates multiple microservices for local testing.
- **Cloud Deployment**:
  - Docker images can be pushed to AWS ECR (Elastic Container Registry).
  - Infrastructure is created automatically using IaC (AWS CDK).

---

## Getting Started 🚀

### Requirements
- Docker
- Java 21+
- Maven
- AWS CLI

---

## Future updates
- Implementing a Frontend app using **ReactJS** and a mobile app using **React Native**.
- Adding an AI feature to be able to handle and predict medicamentation for each patient.
- Providing automated reports on each patient.

