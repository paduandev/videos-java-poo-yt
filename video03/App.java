public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Programando em Java", "Deitel", 800, 400);

        Livro livro2 = new Livro();

        // livro1.setTitulo("Programando em Java");
        // livro1.setAutor("Deitel");
        // livro1.setNumeroPaginas(800);
        // livro1.setValor(400);

        livro1.exibir();
        livro2.exibir();
    }
}
