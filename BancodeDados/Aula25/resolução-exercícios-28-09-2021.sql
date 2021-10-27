SELECT nome, cidade
FROM clientes
WHERE cidade = 'São Paulo'
ORDER BY nome;

SELECT cidade, COUNT(id)
	FROM empregados
    GROUP BY cidade;
    
SELECT a.nome, COUNT(b.id) AS 'Quantidade de Canções'
	FROM generos a
    INNER JOIN cancoes b
    ON a.id = b.id_genero
    GROUP BY a.nome
    HAVING COUNT(b.id) = 81;
    
SELECT CONCAT (nome, ' ', sobrenome)
	FROM empregados
    WHERE data_nascimento = '1984-09-12';

SELECT pais, COUNT(id)
	FROM clientes
    GROUP BY pais
    ORDER BY pais DESC;