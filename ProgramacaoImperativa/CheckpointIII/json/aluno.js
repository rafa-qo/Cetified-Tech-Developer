let alunos = [];

function aluno(nome, faltas, nota){

    this.nome = nome;
    this.faltas = faltas;
    this.nota = nota;

}

alunos.push(new aluno("Rafael Queiroz", 3,[8,10,6]));
alunos.push(new aluno("Bruno Barreto", 0,[6,3,7]));
alunos.push(new aluno("Gabi Nakasone", 2,[10,10,6]));
alunos.push(new aluno("Edimilson Souza", 8,[5,8,2]));
alunos.push(new aluno("Vinicius Evandro", 7,[4,7,3]));
alunos.push(new aluno("Marcelo Barbosa", 1,[3,,9]));

// module.exports = alunos;

let medAluno = (nomeAluno) => {
    let soma = 0;

    let filtro = alunos.filter(nome => {
        return nome.nome === nomeAluno;
    }); 


    for (let index = 0; index < filtro[0].length; index++) {
        soma += filtro[0].nota[index];
    };
    
    return soma;
};

console.log (medAluno("Rafael Queiroz"));