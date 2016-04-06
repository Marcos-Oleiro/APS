-- criar banco
CREATE DATABASE cobaia;
-- conectar
\c cobaia
-- apagar tabela
DROP TABLE IF EXISTS pessoas;
-- criar a tabela
CREATE TABLE pessoas (
    nome      VARCHAR(60),   
    sobrenome VARCHAR(60)
);
-- inserção
INSERT INTO pessoas 
VALUES ('Rafael', 'Betito');

INSERT INTO pessoas 
VALUES ('Igor', 'Pereira');

INSERT INTO pessoas 
VALUES ('Raquel', 'Barbosa');

INSERT INTO pessoas VALUES 
('Tiago', 'Telecken'),
('Guilherme', 'Pereira'),
('Luciano', 'Goncalves');

-- consultar
SELECT * FROM pessoas;
SELECT nome FROM pessoas;

SELECT sobrenome, nome 
FROM pessoas 
ORDER BY sobrenome;

SELECT sobrenome, nome 
FROM pessoas 
ORDER BY sobrenome
LIMIT 3;

-- atualizar
UPDATE pessoas
SET nome = 'Ogro'
WHERE nome = 'Rafael';

-- excluir
DELETE FROM pessoas
WHERE sobrenome = 'Pereira';