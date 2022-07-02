const addCadastro = require('./cadastro');
const listaAlunos = require('./listaestudantes');

const curso = {
    nomeCurso: 'CTD',
    notaAprovacao: 7,
    faltaMaxima: 5, 
    listaEstudantes: listaAlunos,
    adicionarAluno: function(nome, qtdFalta, notas){
      this.listaEstudantes.push(new addCadastro.cadastro(nome, qtdFalta, notas));
    },
    alunoPassou: function (objeto) {
        let falta = objeto.qtdFalta;
        let mediaAluno = addCadastro.calcularMedia(objeto.notas);
        
        if (mediaAluno >= this.notaAprovacao && falta < this.faltaMaxima) {
            return true;
        } else if (falta == this.faltaMaxima && mediaAluno > 1.1*this.notaAprovacao) {
            return true;
        } else {
            return false;
        }
    },
    listaAprovados: function () {
        let lista = [];
        for (let index = 0; index < this.listaEstudantes.length; index++) {
            lista.push(this.alunoPassou(this.listaEstudantes[index]));
        };
        return lista;
    },
}

curso.adicionarAluno("Joana Dark", 5, [8,9,10]);
curso.adicionarAluno("Joao Light", 2, [2,7,1]);

console.log (curso.alunoPassou(curso.listaEstudantes[5]));

console.log(curso.listaAprovados());