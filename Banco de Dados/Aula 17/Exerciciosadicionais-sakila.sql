#Exercício 1
CREATE VIEW vw_listar_pais AS
	SELECT pais
    FROM pais;
    
SELECT *
	FROM vw_listar_pais;
    
#Exercício 2
DROP VIEW filmes_artistas;

CREATE VIEW filmes_artistas AS
SELECT concat(a.nome,' ',a.sobrenome) AS 'Artista', COUNT(filme_id) AS 'Filmes'
	FROM ator a
    INNER JOIN filme_ator f
    ON a.ator_id = f.ator_id
    GROUP BY a.ator_id
    HAVING COUNT(filme_id) > 25 
    ORDER BY a.sobrenome DESC;
    
SELECT *
	FROM filmes_artistas
    WHERE Filmes <33;
    
SELECT LOWER (Artista), Filmes
	FROM filmes_artistas
    WHERE Filmes <33 AND Artista LIKE '% a%';
    
#Exercício 3
DROP VIEW Custos;

CREATE VIEW Custos AS
SELECT c.titulo AS 'Titulo', CONCAT (nome, ' ',sobrenome) AS 'Artista', c.custo_reposicao AS 'Custo'
	FROM filme_ator a
    INNER JOIN ator b
	ON a.ator_id = b.ator_id
    INNER JOIN filme c
    ON a.filme_id = c.filme_id
    WHERE c.custo_reposicao BETWEEN 15 AND 27;
    
SELECT *
	FROM Custos;
    
SELECT *
	FROM Custos
    WHERE 'Titulo' LIKE 'B%';
    
ALTER VIEW Custos AS 
SELECT c.titulo AS 'Titulo', CONCAT (nome, ' ',sobrenome) AS 'Artista', c.custo_reposicao AS 'Custo'
	FROM filme_ator a
    INNER JOIN ator b
	ON a.ator_id = b.ator_id
    INNER JOIN filme c
    ON a.filme_id = c.filme_id
    WHERE b.nome LIKE '%a'
    ORDER BY c.custo_reposicao DESC;
    
SELECT *
	FROM Custos;