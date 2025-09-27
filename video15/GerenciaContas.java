import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> listaContas;
    private int numeroConta;

    public GerenciaContas() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(Cliente cliente) {
        numeroConta++;
        Conta conta = new ContaCorrente(numeroConta, cliente);
        listaContas.add(conta);
    }

    public void novaContaEspecial(double limite, Cliente cliente) {
        numeroConta++;
        Conta conta = new ContaEspecial(numeroConta, limite, cliente);
        listaContas.add(conta);
    }

    public void novaContaPoupanca(Cliente cliente) {
        numeroConta++;
        Conta conta = new ContaPoupanca(numeroConta, cliente);
        listaContas.add(conta);
    }

    public boolean saque(int numeroConta, double valor) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false;
    }

    public boolean deposito(int numeroConta, double valor) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false;
    }

    public boolean removerConta(int numeroConta) {
        for (int i = 0; i < listaContas.size(); i++) {
            if (listaContas.get(i).getNumeroConta() == numeroConta && listaContas.get(i).getSaldo() == 0) {
                listaContas.remove(i);
                return true;
            }
        }
        return false;
    }

    public String exibirConta(int numeroConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.toString();
            }
        }
        return "Não encontrada";
    }

    public String listarContas() {
        return listaContas.toString();
    }

    @Override
    public String toString() {
        return "Contas [" + listaContas + "]";
    }

}
