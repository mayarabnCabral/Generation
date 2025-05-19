/*variavel global, então chamamos ela em varias funções*/
var nome = window.document.querySelector("#nome");
                                /*chamo todo mundo e determino quem eu quero chamar exemplo querySelector("#nome"), 
                                para chamar um id, ou querySelector(".nome"), para chamar uma classe.
                                Posso usasr tambem um get, exemplo getElementById("nome"), que já especifica 
                                o tipo do que eu quero chamar.                               
                                */

var nomeOk = false
var emailOk = false
var assuntoOk = false
var mapa = document.querySelector("#mapa")
var email = document.querySelector("#email");

var assunto = document.querySelector("#assunto");

// deixa a barra lá na pagina grande 
nome.style.width = "100%";
email.style.width ="100%";
assunto.style.width = "100%";

function validarNome(){
    //chama uma variavel dentro da função
    let txtNome = document.querySelector("#txtNome");

    //se o nome tiver menos que duas letras retornara uma mensagem de erro
    if(nome.value.length < 2){

                    /*aparece a mensagem que vem depois, aqui é nome invalido :(, em baixo do campo*/
        txtNome.innerHTML = "nome invalido :(";

                    /*altera a cor da letra*/
        txtNome.style.color = "red";
        nomeOk = false;

    }else{

        txtNome.innerHTML = "nome valido";
        txtNome.style.color = "green";
        nomeOk = true;
    }
}

 function validarEmail(){
     let txtEmail = document.querySelector("#txtEmail");

                        /*verifica se tem um caracter especifico*/
     if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1){

        txtEmail.innerHTML = "E-mail invalido";
        txtEmail.style.color = "red";
        emailOk = false;

     }else{

        txtEmail.innerHTML = "E-mail valido";
        txtEmail.style.color = "green";
        emailOk = true;

     }

 }

 function validarAssunto(){

    let txtAssunto = document.querySelector("#txtAssunto");

    if (assunto.value.length >= 100){

        txtAssunto.innerHTML = "Uauu tenho que correr atrás de bolinhas, digite até 100 carauuuucteres ;)"
        txtAssunto.style.color = "red"
        txtAssunto.style.display = "block"
                                    /*se ele entrar nessa condição o display vai aparecer em block*/

        assuntoOk = false
    }else{

                            /*é como um elemento aparece na nossa pagina*/
        txtAssunto.style.display = "none"
                                    /*não aparece*/

        assuntoOk = true

    }


 }


 function enviar(){

    if(nomeOk == true && emailOk == true && assuntoOk == true){

      /*cria uma mensagem em cima da tela */
      alert("Obriosso pela menssauuuugem");

    }else{

      alert("Você agiu como um gato e esse site pra cachorro");

    }
 }

 function mapaZoom(){

    mapa.style.width= "800px"
    mapa.style.height= "600px"

  }

  function mapaNormal(){

    mapa.style.width= "600px"
    mapa.style.height= "450px"

  }