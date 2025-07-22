public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double valor;

    public Livro(String titulo, String autor, int numeroPaginas, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.valor = valor;
    }

    public Livro() {
        titulo = "Não definido";
        autor = "-";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getValor() {
        return valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibir() {
        System.out.println("Título: " + titulo + " autor: " + autor);
    }
}
