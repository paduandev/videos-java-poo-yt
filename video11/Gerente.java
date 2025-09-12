public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }
    
    @Override
    public String apresentar() {
        return getNome() + " é gerente";
    }

    @Override
    public double calculaSalario() {
        return 1000;
    }
}
