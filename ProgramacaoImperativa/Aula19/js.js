// pessoas = [];

// let insertPessoa = (nome, altura, sexo) 
// {
//     this.nome = nome,
//     this.altura = altura,
//     this.sexo = sexo
// };

const arquivos = [
    {
        "sexo": "F",
        "nome": "Abigael Natte",
        "altura": 1.61
    },
    {
        
        "sexo": "M",
        "nome": "Ramon Connell",
        "altura": 1.75
    },
    {
        
        "sexo": "M",
        "nome": "Jarret Lafuente",
        "altura": 1.55
    },
    {
        
        "sexo": "F",
        "nome": "Ansel Ardley",
        "altura": 1.67
    },
    {
        
        "sexo": "F",
        "nome": "Jacki Shurmer",
        "altura": 1.75
    },
    {
        
        "sexo": "M",
        "nome": "Jobi Mawtus",
        "altura": 1.88
    },
    {
        
        "sexo": "M",
        "nome": "Thomasin Latour",
        "altura": 1.67
    },
    {
        
        "sexo": "F",
        "nome": "Lonnie Verheijden",
        "altura": 1.63
    },
    {
        
        "sexo": "M",
        "nome": "Alonso Wannan",
        "altura": 1.92
    },
    {
        
        "sexo": "F",
        "nome": "Bendite Huggett",
        "altura": 1.80
    }
  ];
  

arquivos.sort(function(a,b) 
    {
        return a.altura - b.altura;
    });

// console.log (arquivos);

let menorAltura = arquivos[0].altura;

console.log (menorAltura);

arquivos.sort(function(a,b) 
    {
        return b.altura - a.altura;
    });

let maiorAltura = arquivos[0].altura;

console.log (maiorAltura);

let filtraMulheres = arquivos.filter(function(pessoa){
    return pessoa.sexo === "F";
    
});

console.log(filtraMulheres);

let noMulheres = filtraMulheres.length;

let somaMulheres = filtraMulheres.reduce(function(acumulador, item){
    // console.log("acumulador", acumulador.altura);
    // console.log ("item", item.altura);
    return acumulador + item.altura;
},0);

let medMulheres = (somaMulheres / noMulheres).toFixed(2);

console.log (medMulheres);

let filtraHomens = arquivos.filter(function(pessoa){
    return pessoa.sexo === "M";
    
});

console.log(filtraHomens);

let noHomens = filtraHomens.length;

console.log("Homens:" + noHomens);