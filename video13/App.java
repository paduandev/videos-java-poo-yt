public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Emerson", "(11) 99999-9999");

        ContaCorrente cc = new ContaCorrente(1, cliente);

        System.out.println(cc);
    }
}
