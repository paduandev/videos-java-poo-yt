public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public boolean deposito(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean saque(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return " [numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }

}
