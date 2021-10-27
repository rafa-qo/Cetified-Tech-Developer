SELECT a.Contato, a.Telefone, a.Endereco, COUNT(*) AS Compras, MIN(DataFatura), MAX(DataFatura)
	FROM clientes a
    INNER JOIN faturas b
    ON a.ClienteID = b.ClienteID
    WHERE b.DataFatura BETWEEN '1996-01-01' AND '1996-12-31'
    GROUP BY a.ClienteID
    HAVING COUNT(b.FaturaId) AND MIN(DataFatura) AND MAX(DataFatura);
    
SELECT LPAD(a.FaturaID,8,'0') AS Fatura, date_format(a.DataFatura, '%Y %M %D') AS dataFatura, b.Cidade
	FROM faturas a
    INNER JOIN clientes b
    ON a.ClienteID = b.ClienteID
    WHERE b.Pais = 'UK' AND a.CidadeEnvio != b.Cidade;
    
SELECT a.Empresa, a.Telefone, a.CorreioID, SUM(b.Transporte) AS ValorTransporte
	FROM correios a
    INNER JOIN faturas b
    ON b.FormaEnvio = a.CorreioID
    GROUP BY a.Empresa;
    
SELECT a.ProdutoNome, b.CategoriaNome
	FROM produtos a
    INNER JOIN categorias b
    ON a.CategoriaID = b.CategoriaID
    INNER JOIN detalhefatura c
    ON a.ProdutoID = c.ProdutoID
    GROUP BY a.ProdutoNome;
    
SELECT a.FaturaId, a.DataFatura, c.Empresa, b.Contato, f.CategoriaNome, e.ProdutoNome, e.PrecoUnitario, d.Quantidade
	FROM faturas a
    INNER JOIN clientes b
    ON a.ClienteID = b.ClienteID
    INNER JOIN correios c
    ON a.FormaEnvio = c.CorreioID
    INNER JOIN detalhefatura d
    ON a.FaturaId = d.FaturaId
    INNER JOIN produtos e
    ON e.ProdutoID = d.ProdutoID
    INNER JOIN categorias f
    ON e.CategoriaID = f.CategoriaID;