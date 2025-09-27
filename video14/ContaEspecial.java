public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double limite, Cliente cliente) {
        super(numeroConta, cliente);
        setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite > 0) {
            this.limite = limite;
        } else {
            this.limite = 1000;
        }
    }

    @Override
    public boolean saque(double valor) {
        if(getSaldo() + this.limite < valor) {
            return false;
        }
        return super.saque(valor);
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.toString();
    }

}
