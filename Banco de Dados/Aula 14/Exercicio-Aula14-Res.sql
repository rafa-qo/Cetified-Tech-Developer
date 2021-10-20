SELECT nome, titulo
	FROM artistas a
    INNER JOIN albuns b
    ON a.id = b.id_artista
    ORDER BY a.id;
    
SELECT a.nome, b.id as fatura, b.valor_total
	FROM clientes a
    INNER JOIN faturas b
    ON a.id = b.id_cliente
    WHERE b.valor_total > 5
    ORDER BY valor_total desc;
    
SELECT a.nome AS Canção, b.nome AS 'Tipo de Arq'
	FROM cancoes a
    INNER JOIN tipos_de_arquivo b
    ON a.id_tipo_de_arquivo = b.id
    ORDER BY a.id;