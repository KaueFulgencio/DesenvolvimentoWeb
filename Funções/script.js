var area = document.getElementById('area');

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