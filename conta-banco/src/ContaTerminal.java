import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, nos diga seu nome: ");
    String nomeCliente = sc.nextLine();

    System.out.println("Digite o número da Agência: ");
    String agencia = sc.nextLine();


    System.out.println("Digite o número da conta: ");
    int conta = sc.nextInt();

    System.out.println("Digite o valor do depósito: ");
    double saldo = sc.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + conta
    + " e seu saldo de " + saldo + " já está disponível para saque.");

    sc.close();

   }
}
