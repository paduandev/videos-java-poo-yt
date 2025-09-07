public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos Antonio");
        Funcionario f2 = new Gerente("Marcelo Santos");

        // System.out.println(f1.apresentar());
        // System.out.println(f2.apresentar());

        Gerente g = (Gerente) f2;
        System.out.println(g.apresentar());
    }
}
