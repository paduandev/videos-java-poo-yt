package exercicio01;

public class Owner {
    private String name;
    private String phone;

    public Owner() {
    }

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String info() {
        return "Proprietário [" + name + ", telefone:" + phone + "]";
    }

}
