package Aula03;

import java.util.Scanner;

public class exercicio05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 2000;

        System.out.println("Horas trabalhadas na semana: ");
        int horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas >= 41) {
            salario = salario + (salario * 0.5);
            System.out.println("Salario apos horas extras: R$"+salario);
        } else {
            System.out.println("Salario: R$"+salario);
        }
    }
    }

