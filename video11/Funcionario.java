public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String apresentar() {
        return nome + " é funcionário";
    }

    public abstract double calculaSalario();
}
