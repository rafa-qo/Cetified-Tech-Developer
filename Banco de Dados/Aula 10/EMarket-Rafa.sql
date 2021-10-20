USE emarket;

#Categorias e Produtos
#1
SELECT *
	FROM categorias;

#2
SELECT CategoriaNome, Descricao 
	FROM categorias;
 
#3
SELECT *
	FROM produtos;

#4    
SELECT	*
	FROM produtos
    WHERE descontinuado = 1; #não tem produtos descontinuados

#5    
SELECT	*
	FROM produtos
    WHERE ProvedorID = 8; #Produtos que ele fornece: 19, 20, 21 e 68

#6    
SELECT *
	FROM produtos
    WHERE PrecoUnitario BETWEEN 10 AND 22;

#7
SELECT *
	FROM produtos
    WHERE UnidadesEstoque < NivelReabastecimento;
    
#8
SELECT *
	FROM produtos
    WHERE UnidadesEstoque < NivelReabastecimento AND UnidadesPedidas = 0;

#Clientes

#1
SELECT Empresa, Contato, Pais, Titulo
	FROM clientes
    ORDER BY Pais;
    
#2
SELECT *
	FROM clientes
    WHERE Titulo = 'Owner';
    
#3
SELECT *
	FROM clientes
    WHERE contato LIKE 'C%';

#FATURAS 
#1    
SELECT *
	FROM faturas
    ORDER BY DataFatura ASC;
    
#2
SELECT *
	FROM faturas
    WHERE PaisEnvio = 'USA' AND FormaEnvio <3 AND FormaEnvio >3; #não existe
    
#3
SELECT COUNT(*)
	FROM faturas 
    WHERE ClienteID = 'GOURL'; #sim, ele fez 9 compras
    
#4
SELECT *
	FROM faturas 
    WHERE EmpregadoID = 2 AND 3 AND 5 AND 8 AND 9;
    
#Produtos
#1
SELECT *
	FROM produtos
    ORDER BY PrecoUnitario DESC;
    
#2
SELECT *
	FROM produtos
    ORDER BY PrecoUnitario DESC
    LIMIT 5;
    
#3
SELECT *
	FROM produtos
    ORDER BY UnidadesEstoque DESC
    LIMIT 10;
    
#DETALHEFATURA
#1
SELECT FaturaId, ProdutoID, Quantidade
	FROM detalhefatura;

#2
SELECT FaturaId, ProdutoID, Quantidade
	FROM detalhefatura
    ORDER BY Quantidade desc;
    
#3
SELECT FaturaId, ProdutoID, Quantidade
	FROM detalhefatura
    WHERE Quantidade BETWEEN 50 AND 100
    ORDER BY Quantidade desc;

#4
SELECT FaturaId, ProdutoID, PrecoUnitario * Quantidade AS Total
	FROM detalhefatura
    WHERE Quantidade BETWEEN 50 AND 100
    ORDER BY Quantidade desc;


#EXTRAS
#1
SELECT *
	From clientes
    WHERE Pais = 'Brazil' OR Pais = 'Mexico' OR Titulo LIKE 'SALES%';

#2
SELECT *
	From clientes
    WHERE Empresa LIKE 'A%';
    
#3
SELECT Cidade, Contato AS 'Nome e Sobrenome', Titulo AS Cargo
	From clientes
    WHERE Cidade = 'Madrid';
    
#4
SELECT *
	From faturas
    WHERE FaturaID BETWEEN 10000 AND 10500;

#5
SELECT *
	From faturas
    WHERE FaturaID BETWEEN 10000 AND 10500 OR ClienteID LIKE 'B%';

#6
SELECT *
	FROM faturas
    WHERE CidadeEnvio = 'Vancouver' OR FormaEnvio = 3;

#7
SELECT * 
	FROM Empregados
    WHERE Sobrenome='Buchanan'; 

#8
SELECT * 
	FROM faturas
    WHERE EmpregadoID = 5;