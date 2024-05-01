import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
    
       int numConta;
       String agencia, nomeCliente;
       double saldo;
       
       System.out.println("Digite o seu nome: ");
       nomeCliente= scanner.nextLine();
       System.out.println("Digite o sua agência: ");
       agencia= scanner.nextLine();
       System.out.println("Digite o número da conta: ");
       numConta= scanner.nextInt();
       System.out.println("Digite o seu saldo: ");
       saldo= scanner.nextDouble();

       System.out.println("Olá "+nomeCliente+ ", obrigada por criar uma conta em nosso banco, sua agência é "+agencia+", conta "
       +numConta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
