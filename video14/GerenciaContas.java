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

    public String listarContas() {
        return listaContas.toString();
    }

    @Override
    public String toString() {
        return "Contas [" + listaContas + "]";
    }

}
