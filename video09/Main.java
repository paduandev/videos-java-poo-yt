public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Doberman doberman = new Doberman();

        System.out.println(animal.emitirSom());
        System.out.println(cachorro.emitirSom());
        System.out.println(doberman.emitirSom());
    }
}
