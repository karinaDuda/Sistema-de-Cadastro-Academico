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

## Executar o projeto
1. Clone o repositório com os códigos referentes ao sistema de cadastros acadêmicos.
2. No PostgreSQL, execute o script SQL fornecido no arquivo Dados_academicos.sql para criar as tabelas e os relacionamentos.
3. Na sua IDE, como o IntelliJ IDEA, crie e configure um arquivo BancoDeDados.properties na pasta resources do seu projeto com as suas credenciais do banco seu dados de dados.
   ```bash
   db.url=jdbc:postgresql://localhost:5432/Dados_academicos
   db.usuario=seu_usuario
   db.senha=sua_senha
4. Por fim, basta executar a classe principal Cadastro.java pela sua IDE.
 
