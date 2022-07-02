/*Nomes do grupo: 
Rafael Queiroz
Robelsa 
Lucas Casasco
Pedro Oliveira
Katy Kaori
*/ 

USE emarket;

/* 1. Crie uma View com os seguintes dados do cliente: Id, contato, Fax e o telefone */

CREATE VIEW DadosClientes AS
	SELECT ClienteID, Contato, Fax, Telefone
    FROM clientes;

/* 2. Liste os números de telefone dos clientes que não possuem fax.
Faça isso de duas maneiras diferentes:
a. Consultando a tabela clientes
b. Consultando a view do cliente */

#a
SELECT Telefone, Fax
	FROM clientes
    WHERE Fax LIKE '';

#b
SELECT *
	FROM DadosClientes
    WHERE Fax LIKE '';
    
/* 1. Crie uma view com os seguintes dados do fornecedor: Id, contato,
empresa e endereço. Para o endereço, pegue o endereço, cidade, código
postal e país.*/

CREATE VIEW Fornecedores AS
SELECT ProvedorID, Contato, Empresa, CONCAT (Endereco, ' ', Cidade, ' ', CodigoPostal, ' ',Pais) AS Endereço
	FROM provedores;

#2
/* 2. Liste os fornecedores que moram na Avenida das Americanas, no Brasil. Faça de duas formas diferentes:
a. Consultando a tabela de fornecedores
b. Consultando a view do fornecedor
*/

#a
SELECT *
	FROM provedores
    WHERE Endereco LIKE '%Americanas%' AND Pais = 'Brazil';

#b    
SELECT *
	FROM Fornecedores
	WHERE Endereço LIKE '%Americanas%Brazil%';
    
#Desafio 1
/* 1. Crie uma view dos produtos que será usada ​​para controle de estoque. Inclua o id e nome do produto, preço unitário arredondado sem decimais, unidades
em estoque e as unidades encomendadas. Inclua também uma nova coluna PRIORIDADE, com os seguintes valores:
BAIXA se as unidades encomendadas forem zero
MÉDIA se as unidades pedidas forem menores do que as unidades em estoque
URGENTE se as unidades pedidas não dobrarem o número de unidades em estoque
PRIORITÁRIO caso contrário */
    
CREATE VIEW vw_prioridade AS
	SELECT ProdutoID, ProdutoNome, FORMAT(PrecoUnitario, 2) AS PrecoUnitario, UnidadesPedidas,
    CASE 
		WHEN UnidadesPedidas=0 THEN "BAIXA"
        WHEN UnidadesPedidas<UnidadesEstoque THEN "MÉDIA"
        WHEN UnidadesPedidas<UnidadesEstoque*2 THEN "ALTA"
        ELSE "PRIORITÁRIO"
    END AS Prioridade
    FROM produtos;
    
SELECT *
	FROM vw_prioridade;
    
DROP VIEW vw_Produtos;