package Aula02;
import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dgite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Sua idade é: "+idade);

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Sua altura é: "+altura);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Seu peso é: "+peso);
    }
}
