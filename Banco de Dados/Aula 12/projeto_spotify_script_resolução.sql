SELECT *
	FROM cancao
    WHERE titulo like "%z%";

SELECT * 
	FROM cancao
    WHERE titulo like "_a%" and "%s";

SELECT titulo AS "Titulo", qtdcancoes AS "Quantidade de Canções"
	FROM playlist
    ORDER BY qtdcancoes DESC;
    
SELECT titulo AS Musica, qtdreproducao AS Reprodução
    FROM cancao
    ORDER BY qtdreproducao DESC LIMIT 5;

SELECT titulo AS Titulo, iddiscografica AS Discografia 
     FROM album
     ORDER BY titulo ASC;
     
SELECT titulo AS Titulo, iddiscografica AS Discografia, imagemcapa AS Imagem
    FROM album WHERE imagemcapa is null
    ORDER BY titulo ASC;

INSERT INTO usuario (idUsuario,Nomeusuario,NomeCompleto,senha,Data_nac,sexo,Cod,Pais_idPais)
	VALUES ('1', 'novousuariodespotify@gmail.com','Elmer Santos', 'S4321m', '1991-11-15', 'M', 'B4129ATF', '9');
    
DELETE generoxcancao
	FROM generoxcancao
    WHERE IdGenero = 9;
    
UPDATE artista SET imagem = 'imagem em falta'
	WHERE imagem is null;
    
SELECT *
	FROM usuario 
    ORDER BY data_nac DESC
    LIMIT 10;
 
#Nomes 
#Moises Bollela
#Eduardo Gonzales
#Marcos Fonseca
#Rafael Queiroz