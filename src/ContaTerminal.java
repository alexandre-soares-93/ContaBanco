import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de sua agência com digito: ");
        String agencia = scanner.next();

        System.out.print("Informe a sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Faça seu primeiro depósito: R$");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponivel para saque.");

    }
}
