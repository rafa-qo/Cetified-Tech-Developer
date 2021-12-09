// Micro desafio - Passo 3

// Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), 
// nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos 
//criados no passo 1).

// Micro desafio - Passo 4

//Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em 
//nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.
let aluno = require('./listaestudantes');

const curso = {
    nomeCurso: 'CTD',
    notaAprovacao: 7,
    faltasMaxima: 5, 
    listaEstudantes: aluno,
    adicionarAluno: function(a){
      this.listaEstudantes.push(a);
      return true;
    },
    alunoPassou: function(aluno){
      let qtdFaltas = aluno.qtdFalta;
      let mediaAluno = aluno.calcularMedia();

      if((mediaAluno >= this.notaAprovacao) && (qtdFaltas < this.faltasMaxima)){
          return true;
      }
      else if(qtdFaltas == this.faltasMaxima){
          if(mediaAluno >= (this.notaAprovacao/10)+this.notaAprovacao){
              return true;
          }
          else{
              return false;
          }   
      }
      else{
          return false;
      }
  },
  situacaoAlunos: () => {
      let situacaoAlunos = [];
      curso.listaEstudantes.forEach(e => {
          situacaoAlunos.push(curso.alunoPassou(e))
      });

      return situacaoAlunos;
  }
}


aluno.forEach(aluno=>{
  curso.adicionarAluno(aluno);
});

// console.log(curso);

// console.log(curso.situacaoAlunos());
