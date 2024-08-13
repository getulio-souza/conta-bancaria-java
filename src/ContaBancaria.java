import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
  public static void main(String[] args) {
    System.out.println("hello world");

    //Conhecer e importar a classe scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //exibir as mensagem para o nosso usuario
    System.out.println("Digite seu nome");
    //obter pela classe scanner os valores digitados no terminal
    String nome = scanner.next();

    //Obtendo a agencia com 4 digitos
    String agencia;
    while (true) {
      System.out.println("Digite sua agencia");
      agencia = scanner.next();

      if (agencia.matches("\\d{4}")) {
        break;
      } else {
        System.out.println("Agencia invalida. Deve conter 4 digitos!");
      }
    }

    String conta;
    while (true) {
      System.out.println("Digite sua conta (formato XXXXX-XX)");
      conta = scanner.next();
      if (conta.matches("\\d{5}-\\d{2}")) {
        break;
      }
      System.out.println("Conta invalida. Deve seguir o formato XXXXX-XX");
    }

    System.out.println("Bem-vindo(a): " + nome);
    System.out.println("Sua agência é: " + agencia);
    System.out.println("Sua conta é: " + conta);
    System.out.println("O que você deseja fazer hoje? Selecione uma das opcoes abaixo:");
    //obtendo o numero da conta
  }
}
