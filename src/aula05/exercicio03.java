package aula05;

import java.util.Scanner;

public class exercicio03 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean[] vetor = new boolean[8];
        int contadorTrue = 0;

        System.out.println("Digite True ou False para cada uma das 8 posicoes: ");

        for (int i = 0; i < vetor.length; i++){
            System.out.println("posição ["+i+"]: ");
            vetor[i] = s.nextBoolean();

            if (vetor[i]){
                contadorTrue++;
            }
        }
        System.out.println("\nQuantidade de valores 'True' inseridos: "+ contadorTrue);
        s.close();
    }
}
