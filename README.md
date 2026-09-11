# Sistema de Cadastro Acadêmico (Java + PostgreSQL)

Sistema simples desenvolvido que visa colocar em prática os conceitos de conexão entre **Java (JDBC)** e **PostgreSQL**. 

A aplicação consiste em um sistema de gerenciamento acadêmico que permite o cadastro de professores, turmas e alunos. A interação é feita via terminal (CLI), onde os dados inseridos pelo usuário são transformados em objetos e persistidos no banco de dados.

## Funcionalidades
- Cadastro de Professores.
- Cadastro de Turmas - vinculadas a um professor responsável.
- Cadastro de Alunos - vinculados a uma turma específica.
- Menu interativo via console.

## Tecnologias Utilizadas
- **Java**: Lógica da aplicação, Orientação a Objetos e entrada de dados via `Scanner`.
- **JDBC**: API para conexão e execução de comandos SQL (`PreparedStatement`).
- **PostgreSQL**: Banco de dados relacional aplicando práticas de modelagem com chaves primárias e estrangeiras.
