package aula05;

import java.util.Scanner;

public class exercicio02 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        System.out.println("Digite uma letra: ");
        String letraProcurada = s.nextLine();

        boolean encontrou = false;

        for(int i = 0; i <letras.length; i++){
            if (letras[i].equalsIgnoreCase(letraProcurada)){
                System.out.println("Letra se encontra na posição: "+i);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            System.out.println("A letra não esta disponivel, tente outra");
        }
        s.close();
    }
}
