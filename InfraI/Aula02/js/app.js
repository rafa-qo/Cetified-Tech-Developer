let nome = prompt("Qual o seu nome?");
let mobile = "";
let wpp = "";

// console.log(nome);

while (nome == "" || nome == null){
        nome = alert("Campo nome é obrigatório!");
        nome = prompt("Qual é o seu nome?")
    };

mobile = prompt("Qual seu número de Celular?");

while (mobile == "" || mobile == null) {
    mobile = alert("Campo celular é obrigatório!");
    mobile = prompt("Qual seu número de Celular?")
}
        
wpp = confirm("O número é WhatsApp?");
alert(`Muito obrigado ${nome}, um de nossos consultores entrará em contato contigo através do número ${mobile}.`);


console.log(`nome: ${nome}, telefone: ${mobile}, aceita receber mensagem por WhatsApp: ${wpp}.`);