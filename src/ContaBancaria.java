import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {

    // Conhecer e importar a classe scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    // exibir as mensagem para o nosso usuario
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Bem-vindo(a) " + nome);

    // Obtendo a agencia com 4 digitos
    String agencia;
    while (true) {
      System.out.println("Digite sua agencia (formato XXXX)");
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

    BigDecimal saldoAtual = new BigDecimal("4300.00");

    // escolhendo entre deposito ou saque
    System.out.println("Escolha uma das opcoes a seguir:");
    System.out.println("1. Extrato");
    System.out.println("2. Deposito");
    System.out.println("3. Saque");
    int opcao = scanner.nextInt();

    switch (opcao) {

      case 1:
        System.out.println("seu saldo atual eh de: " + saldoAtual.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        break;

      case 2:
        // realizando um deposito na conta
        System.out.println("Digite um valor para fazer seu deposito:");
        BigDecimal deposito = scanner.nextBigDecimal();
        saldoAtual = saldoAtual.add(deposito);
        System.out.println("Deposito realizado no valor de: " + deposito.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        System.out.println("Valor atual da conta é de: " + saldoAtual.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        break;

      case 3:
        // realizando um saque na conta
        System.out.println("Digite um valor para fazer seu saque:");
        BigDecimal saque = scanner.nextBigDecimal();
        saldoAtual = saldoAtual.subtract(saque);
        System.out.println("Saque realizado no valor de: " + saque.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        System.out.println("Valor atual da conta é de: " + saldoAtual.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        break;
        
      default:
        System.out.println("Opcao invalida. Por favor, escolha 1 para deposito ou 2 para saque.");
        break;
    }
  }
}
