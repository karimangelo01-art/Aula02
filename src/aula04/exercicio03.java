package aula04;

import java.util.Scanner;

public class exercicio03 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero inteiro positivo: ");
        int numero = s.nextInt();
        System.out.println(numero);

        if (numero < 0){
            System.out.println("Insira um numero inteiro positivo(igual ou maioe a zero)");
        }else {
            long fatorial = 1;
            int contador = numero;

            if (contador>0){
                do {
                    fatorial*= contador;
                    contador--;
                }while (contador>0);
            }
            System.out.println("O fatorial de "+numero+" é: "+fatorial);
        }


    }
}

