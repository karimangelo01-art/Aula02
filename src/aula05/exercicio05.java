package aula05;

import java.util.Scanner;

public class exercicio05 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nome = {"Anao", "Rick", "Theus"};

        System.out.println("Digite um nome: ");
        String nomeprocurado = s.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < nome.length; i++){
            if (nome[i].equalsIgnoreCase(nomeprocurado)){
                System.out.println("Nome encontrado na posição: "+i);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            System.out.println("Nome não encontrado, teste outro");
        }
        s.close();
    }
}
