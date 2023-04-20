/*
var area = document.getElementById('area');
//METODOS DE ENTRADA
function entrar(){
    var nome = prompt("Digite seu nome");

    if(nome === '' || nome === null){
        alert("Ops algo deu errado");
        area.innerHTML = "Clique o botao para acessar..."
    }
    else{
        area.innerHTML = "Bem vindo " + nome + " ";
    
        let botaoSair = document.createElement("button");
        botaoSair.innerText = "Sair da Conta";
        botaoSair.onclick = sair;

        area.append(botaoSair);
    }
}

function sair(){
    alert("Até mais");
    area.innerHTML = "Você Saiu!";
}
//FUNÇÕES COM PARAMETROS
function soma(nota1, nota2){
    var media = (nota1 + nota2) /2;

    if(media >= 7){
        console.log("Aluno aprovado com a media: " + media);
    }else if(media < 7){
        console.log("Aluno reprovado com a media: " + media);
    }
}
//ARRAYS
var lista = ['Joao','Kaue','Rebeca', 139];

lista.push('Fabiano'); //insere na lista

lista.shift(); //remove o primeiro item da lista

lista.pop(); //remove o ultimo elemento da lista

lista.join(';'); //exibe todos os itens da lista, mas com a formatação que estiver no parametro


//LAÇOS DE REPETIÇÃO
var x = 5;
while(x < 10){
    document.write("<br> O valor de x eh: " + x);
    x++;
}
for(a = 0; a < 5; a++){
    document.write("<br> O valor de x eh: " + a);
}
*/

var peso;
var altura;
var imc;
var resultado;

function calcular(event){
    event.preventDefault();

    peso = document.getElementById('peso').value;
    altura = document.getElementById('altura').value;

    imc = peso / (altura * altura);
    resultado = document.getElementById('resultado');
    if(imc < 17){
        resultado.innerHTML = '<br/> Seu resultado foi: ' + imc.toFixed(2) + '</br> Cuidado vc esta abaixo do peso!';
    }else if(imc > 17 && imc <= 18.49){
        resultado.innerHTML = '<br/> Seu resultado foi: ' + imc.toFixed(2) + '</br> Voce esta abaixo do peso';
    }else if(imc > 18.5 && imc <= 24.99){
        resultado.innerHTML = '<br/> Seu resultado foi: ' + imc.toFixed(2) + '</br> Voce esta no peso ideal';
    }else if(imc > 25 && imc <= 29.99){
        resultado.innerHTML = '<br/> Seu resultado foi: ' + imc.toFixed(2) + '</br> Voce esta acima do peso';
    }else if(imc = 30){
        resultado.innerHTML = '<br/> Seu resultado foi: ' + imc.toFixed(2) + '</br> Voce esta abaixo do obeso';
    }

    document.getElementById('peso').value = '';
    document.getElementById('altura').value = '';
}