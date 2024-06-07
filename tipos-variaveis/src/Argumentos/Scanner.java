package Argumentos;

import java.util.Locale;

public class Scanner {
    public static void main(String[] args) {

           //criando o objeto scanner

        java.util.Scanner scanner = new java.util.Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
