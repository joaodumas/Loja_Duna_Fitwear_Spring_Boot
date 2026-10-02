# Loja Duna Fitwear — Spring Boot

API de estudo para uma loja fitness, desenvolvida com Java, Spring Boot, Spring Data JPA e PostgreSQL.

> **Status: EM ANDAMENTO.** O projeto ainda está em desenvolvimento e será ampliado.

## Escopo atual

A API possui operações para listar e cadastrar categorias e produtos. Entidades, serviços, repositórios e controladores estão organizados em pacotes separados. O fluxo completo de pedidos, estoque, pagamentos e descontos ainda será desenvolvido.

## Requisitos

- JDK 21 ou superior
- PostgreSQL

## Configuração do banco

Crie um banco PostgreSQL chamado `lojacarol` e configure estas variáveis de ambiente antes de iniciar a aplicação:

```bash
export DB_URL='jdbc:postgresql://localhost:5432/lojacarol'
export DB_USERNAME='postgres'
export DB_PASSWORD='sua-senha-local'
```

A senha não deve ser adicionada ao repositório.

## Executar

```bash
./mvnw spring-boot:run
```

Os endpoints atuais são `GET /categorias`, `POST /categorias`, `GET /produtos` e `POST /produtos`.
