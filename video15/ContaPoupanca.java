public class ContaPoupanca extends Conta {
    private static double taxaSaque = 0.1;

    public ContaPoupanca(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    public static double getTaxaSaque() {
        return taxaSaque;
    }

    public static void setTaxaSaque(double taxaSaque) {
        ContaPoupanca.taxaSaque = taxaSaque;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() - taxaSaque < valor) {
            return false;
        }
        return super.saque(valor + taxaSaque);
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }

}
