public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public boolean saque(double valor) {
        if(getSaldo() < valor) {
            return false;
        }
        return super.saque(valor);
    }
    
    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
