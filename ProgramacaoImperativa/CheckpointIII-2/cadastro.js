function cadastro(nome, qtdFalta, notas) {
    this.nome = nome;
    this.qtdFalta = qtdFalta;
    this.notas = notas
};

function calcularMedia (x) {
    let somaNotas = 0
    x.forEach(nota => {
        somaNotas += nota;
    });

    let qtdNotas = x.length;

    return somaNotas/qtdNotas;
};

function falta (y) {
    y.qtdFalta +=1;
    return y.qtdFalta;
};

module.exports = {cadastro, calcularMedia, falta};


