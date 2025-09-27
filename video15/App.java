import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciaContas gerenciaContas = new GerenciaContas();
        int opcao;
        String nomeCliente, telefoneCliente;
        int numeroConta;
        double valor, limite;
        boolean sucesso;
        Cliente cliente;

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
                    System.out.println("Informe o nome do cliente:");
                    nomeCliente = scanner.nextLine();
                    System.out.println("Informe o telefone do cliente:");
                    telefoneCliente = scanner.nextLine();
                    cliente = new Cliente(nomeCliente, telefoneCliente);
                    gerenciaContas.novaContaCorrente(cliente);
                    break;
                case 2:
                    System.out.println("Informe o nome do cliente:");
                    nomeCliente = scanner.nextLine();
                    System.out.println("Informe o telefone do cliente:");
                    telefoneCliente = scanner.nextLine();
                    cliente = new Cliente(nomeCliente, telefoneCliente);
                    System.out.println("Informe o valor do limite da conta:");
                    limite = Double.parseDouble(scanner.nextLine());
                    gerenciaContas.novaContaEspecial(limite, cliente);
                    break;
                case 3:
                    System.out.println("Informe o nome do cliente:");
                    nomeCliente = scanner.nextLine();
                    System.out.println("Informe o telefone do cliente:");
                    telefoneCliente = scanner.nextLine();
                    cliente = new Cliente(nomeCliente, telefoneCliente);
                    gerenciaContas.novaContaPoupanca(cliente);
                    break;
                case 4:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = Integer.parseInt(scanner.nextLine());
                    System.out.println(gerenciaContas.exibirConta(numeroConta));
                    break;
                case 5:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = Integer.parseInt(scanner.nextLine());
                    System.out.println("Informe o valor do saque:");
                    valor = Double.parseDouble(scanner.nextLine());
                    sucesso = gerenciaContas.saque(numeroConta, valor);
                    if (sucesso) {
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = Integer.parseInt(scanner.nextLine());
                    System.out.println("Informe o valor do deposito:");
                    valor = Double.parseDouble(scanner.nextLine());
                    sucesso = gerenciaContas.deposito(numeroConta, valor);
                    if (sucesso) {
                        System.out.println("Deposito realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;
                case 7:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = Integer.parseInt(scanner.nextLine());
                    gerenciaContas.removerConta(numeroConta);
                    break;
                case 8:
                    System.out.println(gerenciaContas.listarContas());
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
