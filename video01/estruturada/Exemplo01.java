package estruturada;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        scanner.close();
    }
}
