/* O meu banco de dados é referente a um restaurante que vai começar a implementar um sistema de delivery.
Para isso, estamos trabalhando com a criação de um BD para registrar todos os pedidos e entregas que serão realizadas por esse sistema, 
bem como toda a base de clientes e de entregadores cadastrados. */

CREATE SCHEMA checkpoint2;

USE checkpoint2;

#DROP SCHEMA checkpoint2;

CREATE TABLE cliente (
    clienteid   INT NOT NULL AUTO_INCREMENT,  
    nome        VARCHAR(50), 
    sobrenome   VARCHAR(50),
    telefone    BIGINT (11),
    endereco    VARCHAR (100),
    PRIMARY KEY (clienteid) 
); 

CREATE TABLE prato (
    pratoid     INT NOT NULL AUTO_INCREMENT, 
    valor       DEC (4,2),
    descricao   VARCHAR(50), 
    PRIMARY KEY (pratoid) 
); 

CREATE TABLE complemento (
    complementoid   INT NOT NULL AUTO_INCREMENT,  
	valor           DEC (4,2),
    descricao       VARCHAR(50), 
    PRIMARY KEY (complementoid) 
); 

CREATE TABLE pedidoitem (
    pedidoitemid      INT NOT NULL AUTO_INCREMENT,  
    prato_id          INT, 
    CONSTRAINT fk_pratoid
    FOREIGN KEY (prato_id)
	REFERENCES prato(pratoid),
    complemento_id    INT, 
    CONSTRAINT fk_complementoid
    FOREIGN KEY (complemento_id)
	REFERENCES complemento(complementoid),
    PRIMARY KEY (pedidoitemid) 
); 

CREATE TABLE veiculo (
veiculoid INT NOT NULL AUTO_INCREMENT,
tipo VARCHAR (30),
modelo VARCHAR (30),
PRIMARY KEY (veiculoid)
);

CREATE TABLE entregador (
    entregadorid      INT NOT NULL AUTO_INCREMENT,
    nome              VARCHAR (50),
    sobrenome         VARCHAR(50),
    endereco          VARCHAR (100),
    telefone          INT (11),
    veiculo_id         INT, 
    CONSTRAINT fk_veiculoid
    FOREIGN KEY (veiculo_id)
	REFERENCES veiculo(veiculoid),
    PRIMARY KEY (entregadorid)
); 

CREATE TABLE pedido (
pedidoid      INT NOT NULL AUTO_INCREMENT,
valor_total   DEC (4,2),
cliente_id         INT, 
    CONSTRAINT fk_clienteid
    FOREIGN KEY (cliente_id)
	REFERENCES cliente(clienteid),
pedidoitem_id         INT, 
    CONSTRAINT fk_pedidoitemid
    FOREIGN KEY (pedidoitem_id)
	REFERENCES pedidoitem(pedidoitemid),
entregador_id         INT, 
    CONSTRAINT fk_entregadorid
    FOREIGN KEY (entregador_id)
	REFERENCES entregador(entregadorid),
    PRIMARY KEY (pedidoid)
);

INSERT INTO cliente (nome, sobrenome, telefone, endereco)
	VALUES ('Rafael', 'Queiroz',1111, 'Rua Baluarte 686');
    
UPDATE cliente SET telefone = 11997454353
	WHERE telefone = 1111;
    
INSERT INTO cliente (nome, sobrenome, telefone, endereco)
	VALUES ('Rodolfo', 'Stolf',19981520909, 'Rua Henrique Schaumann 1812');
    
SELECT *
	FROM cliente;
    
DELETE FROM cliente WHERE nome = 'Rodolfo';

SELECT *
	FROM cliente;