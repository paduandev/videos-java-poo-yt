package exercicio01;

public class Animal {
    private String name;
    private String breed;
    private int yearBirth;
    private Owner owner;

    public Animal(String name, String breed, int yearBirth, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.yearBirth = yearBirth;
        if (owner != null) {
            this.owner = owner;
        } else {
            this.owner = new Owner("Não informado", "Não cadastrado");
        }
    }

    public String info() {
        return "Animal [nome=" + name + ", raça=" + breed + ", ano de nascimento: " + yearBirth + " " + owner.info() + "]";
    }

    

}
