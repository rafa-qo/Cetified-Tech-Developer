let cadastro2 = require('./cadastro');

let listaAlunos = [];

listaAlunos.push(new cadastro2.cadastro('Rafael Queiroz',0, [9, 10, 10]));
listaAlunos.push(new cadastro2.cadastro('Bruno Barreto',3, [10, 9.75, 10]));
listaAlunos.push(new cadastro2.cadastro('Gabi Nakasone',1, [10, 10, 10]));
listaAlunos.push(new cadastro2.cadastro('Edimilson Sousa',3, [8, 7, 10]));
listaAlunos.push(new cadastro2.cadastro('Vinicius Evandro',1, [8, 8, 7]));
listaAlunos.push(new cadastro2.cadastro('Marcelo Barbosa',6, [8, 6, 5]));

module.exports = listaAlunos;