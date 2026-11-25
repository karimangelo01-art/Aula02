package Aula03;

import java.util.Scanner;

 class exercicio06 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nota aluno: ");
        double nota = input.nextFloat();

        if (nota >= 7 && nota <= 10) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno em recuperação");
        } else if (nota <= 4){
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Nota invalida");

    }
}}
