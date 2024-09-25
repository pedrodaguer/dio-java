import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {

        terminal();

    }

    static void terminal() {

        Scanner input = new Scanner(System.in);
        int NumeroConta = 0;
        String Agencia = "";
        String NomeCliente = "";
        float Saldo = 0;

        try {
            System.out.println("\nSeja bem-vindo ao terminal! \n\nPor Favor insira seu número de conta: ");
            NumeroConta = Integer.parseInt(input.nextLine());
        }

        catch (NumberFormatException e) {
            System.out.println("\nO número da conta deve conter apenas caracteres numéricos! Tente novamente.");
            terminal();
        }

        try {
            System.out.println("Agora insira o número da sua agência: ");
            Agencia = input.nextLine();
        }

        catch (NumberFormatException e) {
            System.out.println("\nHouve um erro ao processar o número inserido! Tente novamente.");
            terminal();
        }

        try {
            System.out.println("Por favor insira seu nome: ");
            NomeCliente = input.nextLine();
        }
         catch (NumberFormatException e) {
            System.out.println("\nO seu nome deve conter apenas letras! Tente novamente.");
            terminal();
        }

        try {
            System.out.println("Por favor insira seu saldo: ");
            Saldo = input.nextFloat();
        }
         catch (NumberFormatException e) {
            System.out.println("\nHouve um erro ao processar o valor inserido! Tente novamente.");
            terminal();
        }

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", conta " + NumeroConta + " e seu saldo de " + Saldo + " já está disponível para saque.");
    }

    }
