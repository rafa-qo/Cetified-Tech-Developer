USE musimundos;

CREATE VIEW FATURAS_NACIONAIS AS
	SELECT f.id AS id_fatura, f.data_fatura, c.id AS id_cliente , c.nome, c.sobrenome, f.valor_total
    FROM faturas f
    INNER JOIN clientes c
    WHERE pais_cobranca = 'Argentina'
    GROUP BY id_fatura
    ;
    
DROP VIEW FATURAS_NACIONAIS;
    
SELECT *
	FROM FATURAS_NACIONAIS;
    
#CREATE VIEW LATINOS AS
	SELECT a.nome AS 'Artista', b.titulo 'Álbum', c.nome AS 'Canção', g.nome AS 'Gênero'
    FROM artistas a
    INNER JOIN albuns b
    ON a.id = b.id_artista
	INNER JOIN cancoes c
    ON b.id = c.id_album
	INNER JOIN generos g
    ON g.id = c.id_genero
	WHERE g.nome = 'Latin'
    ORDER BY Artista, Canção ASC;
    
DROP VIEW LATINOS;

SELECT *
FROM LATINOS;

CREATE VIEW Faturas_Brazil AS
	SELECT c.nome, c.sobrenome, f.pais_cobranca, SUM(f.valor_total)
    FROM clientes c 
    INNER JOIN faturas f
    ON c.id = f.id_cliente
    WHERE f.pais_cobranca = 'Brazil'
    GROUP BY c.id
    Order by SUM(f.valor_total) DESC;
    