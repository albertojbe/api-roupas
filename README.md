<h1 align="center">ROUPAS CRUD</h1>

API para gerenciar roupas [CRUD] criada como um desafio para desenvolver minhas habilidades
na criação e manuntenção de APIs Restful.

## Tecnologias

- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring HATEOAS](https://spring.io/projects/spring-boot)
- [Spring Data JPA + Hibernate](https://spring.io/projects/spring-data-jpa)
- [Dozer Mapper](https://github.com/DozerMapper/dozer)
- [MySQL](https://dev.mysql.com/downloads/)

## Práticas Adotadas

- Arquitetura Limpa
- Testes unitários com JUnit e Mockito
- Uso de DTOs
- Injeção de Dependências
- Migrations com Flyway
- Tratamento de exceções

## API Endpoints

A API poderá ser acessada em [localhost:8080]((http://localhost:8080)).

- GET /clothe - Envia todas as entidades do banco de dados.


- GET /clothe/{id} - Envia a entidade com o ID requisitado.


- POST /clothe - Recebe uma entidade via JSON e inseri no banco de dados.

```json
{
  "type": "type",
  "brand": "brand",
  "size": "size",
  "price": "0.00",
  "quantity": "0"
}
```

- PUT /clothe/{id} - Recebe uma entidade e um ID e a atualiza no banco de dados.
```json
{
  "type": "type",
  "brand": "brand",
  "size": "size",
  "price": "0.00",
  "quantity": "0"
}
```

- DELETE /clothe/{id}
