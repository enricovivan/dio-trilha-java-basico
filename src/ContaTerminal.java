import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String numeroAgencia, nomeCliente;
        Double saldoConta;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o seu numero da conta: ");
        System.out.print("N Conta: ");
        numeroConta = Integer.valueOf(sc.nextLine());

        System.out.println("\nPor favor, informe o numero da agencia: ");
        System.out.print("N Agencia: ");
        numeroAgencia = sc.nextLine();
        
        System.out.println("\nPor favor, informe o nome do cliente: ");
        System.out.print("Nome Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("\nPor favor, informe o saldo da conta: ");
        System.out.print("Saldo Conta: ");
        saldoConta = Double.valueOf(sc.nextLine());

        System.out.println("\n\nOla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "+ numeroAgencia +", conta " + numeroConta + " e seu saldo " + saldoConta + " ja esta disponivel para saque!");

        sc.close();

    }
}
