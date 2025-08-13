package exercicio01;

public class MainEx01 {
    public static void main(String[] args) {
        Owner proprietario = new Owner("Ana", "(11) 99999-9999");

        Animal animal = new Animal("Rex", "Lulu", 2020, proprietario);

        System.out.println(animal.info());
    }
}
