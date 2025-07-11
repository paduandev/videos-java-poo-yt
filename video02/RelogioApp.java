public class RelogioApp {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        // relogio.hora = -34;
        // relogio.minuto = 20;
        // relogio.segundo = 34;

        relogio.setHora(3);
        relogio.setMinuto(20);
        relogio.setSegundo(99);

        System.out.println("A hora atual é " + relogio.getHora());

        relogio.exibir();
    }
}
