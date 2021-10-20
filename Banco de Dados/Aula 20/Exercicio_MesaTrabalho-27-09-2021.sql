/* GRUPO:
Katy Kaori
Rafael Queiroz
Alex Crespo
Michel Nunes
Guilherme Pereira
Juan Ferreira */

USE emarket;

#Group by e Join
SELECT b.ProdutoNome, b.PrecoUnitario, a.Quantidade, (a.PrecoUnitario*a.Quantidade) AS Total
FROM detalhefatura a
INNER JOIN produtos b
ON a.ProdutoID = b.ProdutoID
GROUP BY b.ProdutoNome;

#Having
SELECT b.ProdutoNome, b.PrecoUnitario, a.Quantidade, (a.PrecoUnitario*a.Quantidade) AS Total
FROM detalhefatura a
INNER JOIN produtos b
ON a.ProdutoID = b.ProdutoID
GROUP BY b.ProdutoNome
HAVING a.Quantidade > 40;

#Funções de agregação
#1
SELECT MAX(DataFatura)
FROM faturas
ORDER BY DataFatura DESC;

#2
SELECT ProdutoNome, MIN(PrecoUnitario)
FROM produtos
ORDER BY PrecoUnitario DESC;

#Operadores & joins
#1
SELECT Contato, CONCAT(Endereco, ' ', Cidade)
FROM clientes
WHERE Cidade = 'London';

#2
SELECT CONCAT(a.Nome, ' ', a.Sobrenome), SUM(b.Transporte) AS total
FROM empregados a
INNER JOIN faturas b
ON a.EmpregadoID = b.EmpregadoID
GROUP BY CONCAT(a.Nome, ' ', a.Sobrenome)
ORDER BY SUM(b.Transporte) DESC;

#Order by
SELECT ProdutoNome, PrecoUnitario
FROM produtos
ORDER BY PrecoUnitario DESC
LIMIT 5;

#Where
SELECT ProdutoNome
FROM Produtos
WHERE ProdutoNome LIKE '%spread%'; 

#Indice
#1
SHOW INDEXES FROM produtos;

#2
DROP INDEX Produtos_ProdutoNome ON produtos;

#3
SELECT a.ProdutoNome, b.ProdutoID, b.PrecoUnitario, b.Quantidade
FROM produtos a
INNER JOIN detalhefatura b
ON a.ProdutoID = b.ProdutoID;

#4
CREATE INDEX idx_Produto_DetalheFatura ON produtos(ProdutoNome);

EXPLAIN produtos;

DROP INDEX idx_Produto_DetalheFatura ON produtos;
