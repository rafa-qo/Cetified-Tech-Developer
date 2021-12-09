// Micro desafio - Passo 1

// Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). 
// Crie um construtor para ele e importe-o como o módulo aluno.

function cadastro(nome, qtdFalta, notas) {
    this.nome = nome;
    this.qtdFalta = qtdFalta;
    this.notas = notas
    this.calcularMedia = () => {
        let somaNotas = 0
        this.notas.forEach(nota => {
            somaNotas += nota;
        });
    
        let qtdNotas = this.notas.length;
    
        return somaNotas/qtdNotas;
    },

    this.falta = ()=>{
        this.qtdFalta +=1;
        return this.qtdFalta;
    };
};

// Micro desafio - Passo 2

// Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado 
// faltas, que simplesmente aumenta o número de faltas em 1.

module.exports = cadastro;


