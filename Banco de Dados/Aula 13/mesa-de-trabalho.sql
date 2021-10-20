#Faturas
#1
SELECT MAX(valor_total)
	FROM faturas
    WHERE cidade_cobranca = 'Oslo';
    
#2
SELECT MIN(valor_total)
	FROM faturas;
    
#3
SELECT AVG(valor_total)
	FROM faturas
    WHERE pais_cobranca = 'Canada';
    
#4
SELECT count(id)
	FROM faturas
    WHERE pais_cobranca = 'Canada';
    
#5
SELECT SUM(valor_total)
	FROM faturas;
    
SELECT id, data_fatura, valor_total
	FROM faturas
    WHERE valor_total < (SELECT AVG(valor_total) FROM faturas);
    
#Empregados
#7
SELECT max(data_nascimento)
	FROM empregados;
    
#8
SELECT min(data_nascimento)
	FROM empregados;
    
#9
SELECT date_format (data_nascimento, "%d %M %Y")
	FROM empregados;
    
#10
SELECT compositor, COUNT(*)
	FROM cancoes
    WHERE compositor = 'AC/DC';
    
#11
SELECT AVG(duracao_milisegundos)
	FROM cancoes;
    
#12
SELECT AVG(bytes)
	FROM cancoes
    WHERE compositor = 'AC/DC';
    
#CLientes
#13
SELECT COUNT(*)
	FROM clientes
    WHERE cidade = 'São Paulo';
    
#14
SELECT cidade, Count(*)
	FROM clientes
    WHERE cidade = 'Paris';

#15
SELECT COUNT(*)
	FROM clientes
    WHERE email like '%yahoo%';