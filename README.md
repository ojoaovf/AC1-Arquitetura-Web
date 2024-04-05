# Atualização do Microserviço de Alunos

Este é um projeto de atualização do microserviço de alunos para adicionar suporte a persistência de dados utilizando JPA (Java Persistence API) com o Hibernate. As alterações foram feitas na branch `aula06`.

## Descrição

Este projeto é uma continuação do trabalho das últimas semanas, onde agora o foco é adicionar suporte a persistência de dados utilizando JPA com o Hibernate, além de atender a nova especificação de uso.

## Alterações Realizadas

- Adicionadas dependências para JPA e Hibernate
- Configuração das propriedades do banco de dados no arquivo application.properties para uso com JPA e Hibernate
- Refatoração dos métodos existentes para atender à nova especificação de uso do JPA com o Hibernate
- Garantia de existência de endpoints para todas as consultas conforme nova especificação
- Criação da branch aula06 para desenvolvimento da nova versão

## Estrutura do Projeto

A estrutura do projeto permanece similar às versões anteriores, com a adição das configurações necessárias para o uso de JPA com o Hibernate:

`src/main/java/joao/ac1/repository`: Pacote contendo as interfaces e implementações dos repositórios.
`src/main/java/joao/ac1/service`: Pacote contendo as interfaces e implementações dos serviços.
`src/main/java/joao/ac1/model`: Pacote contendo as classes de modelo.

## Requisitos

- Java 8 ou superior
- Banco de dados PostgreSQL
- IntelliJ IDEA (ou outra IDE de sua preferência)

## Prints Postman




