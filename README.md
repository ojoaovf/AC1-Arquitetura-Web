# Microserviço de Gerenciamento de Alunos

Este é um projeto de microserviço para gerenciar alunos em uma universidade, implementado com Spring Boot e JDBC Template para interação com o banco de dados.

## Descrição

Este microserviço é parte de uma aplicação maior que visa gerenciar todos os aspectos de uma universidade. Ele lida especificamente com as operações CRUD (Create, Read, Update, Delete) relacionadas aos alunos. Cada aluno possui os seguintes atributos: nome, idade, sexo, email e nacionalidade.

## Funcionalidades

- CRUD de alunos (Create, Read, Update, Delete)
- Pesquisa de alunos por diferentes critérios (nome, idade, sexo, email, nacionalidade)

## Requisitos

- Java 8 ou superior
- Banco de dados PostgreSQL
- IntelliJ IDEA (ou outra IDE de sua preferência)

## Prints Postman
### GET inicial
Capturando todos os dados do banco

![Postman Aula 03](https://github.com/ojoaovf/AC1-Arquitetura-Web/blob/aula05/imgs/get_inicial.png)

### POST
Adicionando mais uma aluna ao banco

![Postman Aula 03](https://github.com/ojoaovf/AC1-Arquitetura-Web/blob/aula05/imgs/post.png)

### PUT
Atualizando e-mail e idade da aluna de id = 3

![Postman Aula 03](https://github.com/ojoaovf/AC1-Arquitetura-Web/blob/aula05/imgs/put.png)

### DELETE
Deletando a aluna de id = 2

![Postman Aula 03](https://github.com/ojoaovf/AC1-Arquitetura-Web/blob/aula05/imgs/delete.png)

### GET final
Capturando todos os dados do banco após as alterações

![Postman Aula 03](https://github.com/ojoaovf/AC1-Arquitetura-Web/blob/aula05/imgs/get_final.png)
