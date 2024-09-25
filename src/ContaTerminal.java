import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nSeja bem-vindo ao terminal! \n\nPor Favor insira seu número de conta: ");
        int NumeroConta = Integer.parseInt(input.nextLine());

        System.out.println("Agora insira o número da sua agência: ");
        String Agencia = input.nextLine();

        System.out.println("Por favor insira seu nome: ");
        String NomeCliente = input.nextLine();

        System.out.println("Por favor insira seu saldo: ");
        float Saldo = input.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", conta " + NumeroConta + " e seu saldo de " + Saldo + " já está disponível para saque.");
        }
    }
