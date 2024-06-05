package Operadores;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Operadores {

    public static void main(String[] args) {
        
        //Operadores Aritiméticos, Operadores Unários, Operadores Relacionais, Operadores Lógicos, Operador Ternário

        //Atribuição representado pelo sinal de Igualdade  ' = '
        String nome = "Jean";
        int idade = 28;
        double peso = 75.1;
        char sexo = 'M';
        Boolean doadorOrgao = false;
        Date dataNascimento = new Date(1996); 

        //Operadores Aritimeticos Adição + , Subtração - , Divisão / , Multiplicação * e Módulo %
        double soma = 3 + 4;
        int subtracao = 5 - 1;
        int divisao = 10 / 2;
        int multiplicacao = 3 * 3;
        int modulo = 9 % 5;
        double resultado = (10 * 10) + (3 + 5);

        //OBS: O operador de adição + utilizado com Stings não haverá soma e sim uma concatenação (Junção) entre as Strings

        //EX:
        String nomeCompleto = "Jean " + "Carlos";


        //Operador Unários
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    

        //Operador Ternário é represerntado pelos simbolos ?: utilizados na seguinte estrutura de sintaxe:  <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

        int a , b;

        a = 5;
        b = 6;

        //Exemplo de condicionar utilizando uma estrutura if/eslse

        String result = "";

        if (a == b) {
            result = "Verdadeiro";
        }else {
            result = "Falso";
            
        }

        System.out.println(result);

        //Maneira mais simplificada de chegar no mesmo resultado:   String result = a==b ? "verdadiro" : "falso";



        //Operadores Relacionais

        //== Quando desejamos verificar se uma variável é IGUAL A outra.

        //!= Quando desejamos verificar se uma variável é DIFERENTE da outra.

        //> Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        //>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

       //< Quando desejamos verificar se uma variável é MENOR QUE outra.

      //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.


      int number1 = 5;
      int number2 = 6;

      boolean yesNot = number1 == number2;
        System.out.println("Number1 é igual a Number2? " + yesNot);

        yesNot = number1 != number2;
        System.out.println("Number1 é diferente de Number2? " + yesNot);

        yesNot = number1 > number2;
        System.out.println("Number1 é maior que Number2? " + yesNot);

        yesNot =  number1 < number2;
        System.out.println("Number1 é menor que Number2? " + yesNot);

        yesNot = number1 >= number2;
        System.out.println("Number1 é maior ou igual a Number2? " + yesNot);

        yesNot = number1 <= number2;
        System.out.println("Number1 é menor ou igual a Number2? " + yesNot);



        //Operadores Lógicos  &&   e   ||

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){

           System.out.println("As duas condições são verdadeiras ");

        }else if (condicao1 || condicao2){

            System.out.println("Uma das duas condições é falsa");

        }else{
            
            System.out.println("As duas condições são falsas");
        }
    }
}
