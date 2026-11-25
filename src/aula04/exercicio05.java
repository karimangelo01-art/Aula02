package aula04;

import java.util.Scanner;

public class exercicio05 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nota primeiro bimestre: ");
        int nota1 = s.nextInt();
        System.out.println(nota1);

        System.out.println("Nota segundo bimestre: ");
        int nota2 = s.nextInt();
        System.out.println(nota2);

        System.out.println("Nota terceiro bimestre: ");
        int nota3 = s.nextInt();
        System.out.println(nota3);

        System.out.println("Nota quarto bimestre: ");
        int nota4 = s.nextInt();
        System.out.println(nota4);

        System.out.println("Nota extra: ");
        int notaX = s.nextInt();
        System.out.println(notaX);

        int media = (nota1 + nota2 + nota3 + nota4 +notaX) /5;

        System.out.println("Media: "+media);
    }
}
