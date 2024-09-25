import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int NumeroConta;
        String Agencia;
        String NomeClinte;
        float Saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao terminal! \nPor Favor insira seu número de conta: ");
        NumeroConta = input.nextInt();
        System.out.println(NumeroConta);

    }
}
