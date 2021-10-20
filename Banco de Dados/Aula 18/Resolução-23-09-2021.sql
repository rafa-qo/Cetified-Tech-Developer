USE emarket;

#1
DELIMITER $$
  CREATE PROCEDURE sp_listar_empregados () 
   BEGIN 
      SELECT Nome, Sobrenome 
      FROM empregados
      ORDER BY Nome;
   END $$ 
DELIMITER ;

DROP PROCEDURE sp_empregados;

CALL sp_listar_empregados ();

#2
DELIMITER $$
  CREATE PROCEDURE sp_funcionarios_cidade(IN cidade_nome VARCHAR (50)) 
   BEGIN 
      SELECT Nome, Sobrenome, Cidade
      FROM empregados
      WHERE Cidade = cidade_nome;
   END $$ 
DELIMITER ;

DROP PROCEDURE sp_funcionarios_cidade;

CALL sp_funcionarios_cidade ('Seattle');


#3
DELIMITER $$
  CREATE PROCEDURE sp_retornar_no_funcionários (IN Cidade_entrada VARCHAR (50), OUT qtde_funcionarios INT(10)) 
   BEGIN 
      SELECT COUNT(*) INTO qtde_funcionarios
      FROM empregados
      WHERE Cidade = Cidade_entrada;
   END $$ 
DELIMITER ;

DROP PROCEDURE sp_retornar_no_funcionários;

CALL sp_retornar_no_funcionários ('Seattle', @quantidade);
SELECT @quantidade;

SELECT *
FROM empregados;

#4
DELIMITER $$
CREATE PROCEDURE sp_produtos_estoque_abaixo (IN no_unidades INT)
BEGIN
SELECT ProdutoNome, UnidadesEstoque, CategoriaNome
FROM produtos a
INNER JOIN categorias b
ON a.CategoriaID = b.CategoriaID
WHERE UnidadesEstoque < no_unidades;
END $$
DELIMITER ;

CALL sp_produtos_estoque_abaixo (0);

#5
DELIMITER $$
CREATE PROCEDURE sp_porcentagem_venda (IN porcentagem INT)
BEGIN
SELECT d.ProdutoNome, b.Desconto, c.Empresa, (d.PrecoUnitario / 100 * porcentagem) AS Porcentagem
FROM faturas a
INNER JOIN detalhefatura b
ON a.FaturaId = b.FaturaId
INNER JOIN clientes c
ON a.ClienteID = c.ClienteID
INNER JOIN produtos d
ON b.ProdutoID = d.ProdutoID
WHERE b.Desconto >= (d.PrecoUnitario / 100 * porcentagem);
END $$
DELIMITER ;

DROP PROCEDURE sp_porcentagem_venda;

CALL sp_porcentagem_venda (1);