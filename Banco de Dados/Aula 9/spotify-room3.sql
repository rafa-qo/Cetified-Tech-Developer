#Nome:  Cristiano Dewes, Gabi Nakasone, Geyson Kaio, Jonas Pacheco, Pablo Gonçalves, Rafael Queiroz, Edmilson Braz

CREATE DATABASE spotfy;

USE spotfy;

CREATE TABLE usuario
(
    idUsuario           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeusuario         VARCHAR(45),
    data_nac            DATE,
    sexo                VARCHAR(1),
    email               VARCHAR(150),
    senha               VARCHAR(45)
);

CREATE TABLE playlist
(
id_playlist    INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_usuario     INT(11),
titulo         VARCHAR(45),
qtdcancoes     INT(11),
datacriacao    DATETIME,

CONSTRAINT fk_playlist_usuario
    FOREIGN KEY (id_usuario)
    REFERENCES usuario(idUsuario)
);

CREATE TABLE artista
(
idArtista    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome         VARCHAR(45),
sobrenome    VARCHAR(100)
);

CREATE TABLE album(
idAlbum     INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo      VARCHAR(45),
idArtista   INT(11),
CONSTRAINT fk_idArtista
    FOREIGN KEY (idArtista)
    REFERENCES artista (idArtista)
);

CREATE TABLE cancoes
(
idCancao       INT(11) NOT NULL AUTO_INCREMENT,
titulo         VARCHAR(45),
duracao        DOUBLE,
qtdreproducao  INT(11),
qtdlikes       INT(11),
idAlbum        INT(11),
PRIMARY KEY (idCancao),
CONSTRAINT fk_idAlbum
   FOREIGN KEY (idAlbum)
   REFERENCES album (idAlbum)
);

CREATE TABLE playlist_cancao
(
    idPlaylist_Cancao   INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Idcancao            INT(11),
    idPlaylist          INT(11),

    CONSTRAINT fk_playlist_cancao
    FOREIGN KEY (Idcancao)
    REFERENCES cancoes(idCancao),

    CONSTRAINT fk_playlist_playlist
    FOREIGN KEY (IdPlaylist)
    REFERENCES playlist (id_playlist)
);

create table genero
(
id_genero   int not null auto_increment primary key,
genero      varchar(45)
);

create table genero_cancao
(
id_genero_cancao   int not null auto_increment primary key,
id_cancao          int(11),
id_genero          int (11),
constraint fk_idcancao
foreign key (id_cancao) references cancoes (idCancao),
constraint fk_idgenero 
foreign key (id_genero) references genero (id_genero)
);