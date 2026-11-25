package Aula03;
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome= s.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();

        if (idade >= 18){
            System.out.println("Acesso liberado!!");
    } else{
            System.out.println("Acesso negado!!");
        }
        s.close();
}
}