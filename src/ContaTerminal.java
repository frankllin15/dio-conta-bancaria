import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do titular da conta:");
            String titular = scanner.nextLine();
            System.out.println();

            System.out.println("Digite o número da agência:");
            int agencia = scanner.nextInt();
            System.out.println();

            System.out.println("Digite o número da conta:");
            int numero = scanner.nextInt();
            System.out.println();

            conta.setTitular(titular);
            conta.setAgencia(agencia);
            conta.setNumero(numero);
        }
        
        conta.mostraDados();
    }
}
