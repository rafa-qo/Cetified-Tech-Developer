/* Faça uma lista de produtos. Para cada um, indique seu nome, categoria e as informações de contato de seu fornecedor.
Lembre-se que podem existir produtos para os quais o fornecedor não foi indicado. */

USE emarket;

SELECT a.ProdutoNome, b.CategoriaNome, c.Contato AS ContatoFornecedor
	FROM produtos a
    INNER JOIN categorias b
    ON a.CategoriaID = b.CategoriaID
    LEFT JOIN provedores c
    ON a.ProvedorID = c.ProvedorID;
    
/*Para cada categoria, liste o preço unitário médio de seus produtos.*/

SELECT a.CategoriaNome, AVG(b.PrecoUnitario)
	FROM categorias a
    INNER JOIN produtos b
    ON a.CategoriaID = b.CategoriaID
    GROUP BY a.CategoriaNome;
    
/* Liste todas as categorias junto com informações sobre seus produtos.
Incluir todas as categorias, mesmo que não tenham produtos.*/

SELECT *
	FROM categorias a
    LEFT JOIN produtos b
    ON a.CategoriaID = b.CategoriaID;
