package poo;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Pessoa();

        p.idade = scanner.nextInt();

        p.maiorDeIdade();

        scanner.close();
    }
}
