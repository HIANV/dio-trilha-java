import java.util.Scanner;

class ContaBancaria {
    String nomeTitular;
    String numeroAgencia;
    String numeroConta;
    double saldo;

    public ContaBancaria(String nomeTitular, String numeroAgencia, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Conta criada com sucesso!");
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Informe o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nomeTitular, numeroAgencia, numeroConta, saldo);

        conta.exibirDetalhes();
        
        scanner.close();
    }
}

