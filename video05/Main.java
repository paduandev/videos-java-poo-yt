public class Main {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("São Paulo", "Corinthians");
        Placar p3 = new Placar("São Paulo", "Corinthians", 3, 1);

        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
