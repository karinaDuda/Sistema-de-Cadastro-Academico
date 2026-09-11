CREATE TABLE professores (
	id_professor SERIAL PRIMARY KEY,
	nome_professor VARCHAR(80) NOT NULL,
	curso VARCHAR(20) NOT NULL
);

CREATE TABLE turmas (
	id_turma SERIAL PRIMARY KEY,
	nome_turma VARCHAR(50) NOT NULL,
	sala VARCHAR(20) NOT NULL,
	professor_id INT REFERENCES professores(id_professor)
);

CREATE TABLE alunos (
	nome_aluno VARCHAR(80) NOT NULL,
	matricula VARCHAR(10) PRIMARY KEY NOT NULL,
	idade int,
	turma_id INT REFERENCES turmas(id_turma) 
);

SELECT * FROM professores;
SELECT * FROM turmas;
SELECT * FROM alunos;

SELECT t.id_turma, t.nome_turma, p.nome_professor, a.nome_aluno
FROM professores p
JOIN turmas t ON p.id_professor = t.professor_id
JOIN alunos a ON t.id_turma = turma_id;