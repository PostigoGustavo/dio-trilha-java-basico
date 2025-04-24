import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Criando variáveis a serem lidas no terminal
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
       
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        //Exibindo os dados lidos no terminal
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
