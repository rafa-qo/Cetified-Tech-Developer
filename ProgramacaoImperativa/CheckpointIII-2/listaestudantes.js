let cadastro = require('./cadastro');

let listaAlunos = [];

listaAlunos.push(new cadastro('Rafael Queiroz',0, [9, 10, 10]));
listaAlunos.push(new cadastro('Bruno Barreto',3, [10, 9.75, 10]));
listaAlunos.push(new cadastro('Gabi Nakasone',1, [10, 10, 10]));
listaAlunos.push(new cadastro('Edimilson Sousa',3, [8, 7, 10]));
listaAlunos.push(new cadastro('Vinicius Evandro',1, [8, 8, 7]));
listaAlunos.push(new cadastro('Marcelo Barbosa',6, [8, 6, 5]));

module.exports = listaAlunos;