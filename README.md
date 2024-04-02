# Atualização do Microserviço de Alunos

Este é um projeto de atualização do microserviço de alunos para torná-lo mais versátil e desacoplado, implementando inversão de controle e injeção de dependências. As alterações foram feitas na branch `aula04`.

## Descrição

Este projeto é uma continuação do trabalho da semana anterior, onde o foco agora é refatorar o microserviço de alunos para adotar práticas de programação mais avançadas, como inversão de controle e injeção de dependências. O objetivo é tornar o código mais modular, flexível e fácil de manter.

## Alterações Realizadas

- Implementação de interfaces para desacoplamento
- Utilização de inversão de controle e injeção de dependências
- Refatoração do código para separação de responsabilidades entre camadas (Repositório, Serviço, Modelo)
- Criação de novas implementações baseadas em interfaces
- Integração das alterações à branch `aula04`

## Estrutura do Projeto

A estrutura do projeto foi reorganizada para refletir a nova arquitetura desacoplada:

- `src/main/java/joao/ac1/repository`: Pacote contendo as interfaces e implementações dos repositórios.
- `src/main/java/joao/ac1/service`: Pacote contendo as interfaces e implementações dos serviços.
- `src/main/java/joao/ac1/model`: Pacote contendo as classes de modelo.

## Requisitos

- Java 8 ou superior
- Banco de dados PostgreSQL
- IntelliJ IDEA (ou outra IDE de sua preferência)
