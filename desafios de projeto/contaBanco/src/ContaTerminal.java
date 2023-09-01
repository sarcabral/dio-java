import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void mostraCadastro(String nomeCliente, String agencia, int numero, float saldo){
        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência e "+agencia+", conta "+numero+" e saldo R$"+saldo+" já esta disponível para saque.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Conta de Banco");

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Agora, seu sobrenome: ");
        String sobrenome = scanner.next();

        String nomeCompletoCliente = nome.concat(" ").concat(sobrenome);

        System.out.print("Agora, digite sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.print("Por fim, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        mostraCadastro(nomeCompletoCliente, agencia, numero, saldo);

    }
    
}
