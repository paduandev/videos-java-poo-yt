import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Consultar Conta");
            System.out.println("5-Saque");
            System.out.println("6-Deposito");
            System.out.println("7-Apagar Conta");
            System.out.println("8-Listar contas");
            System.out.println("9-Sair");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 9);

        scanner.close();
    }
}
