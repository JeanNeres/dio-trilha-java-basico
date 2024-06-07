package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para iniciarmos a abertura da sua conta digite o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("agora escolha a sua agência: ");
        String agencia = scanner.next();

        System.out.println("escolha o número da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Informe o saldo para que deseja depositar ");
        float saldo = scanner.nextFloat();

        System.err.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta de número " + conta + " e seu saldo de " + saldo + " já está disponível para saque." );

    }
}
