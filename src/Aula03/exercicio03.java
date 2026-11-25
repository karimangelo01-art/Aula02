package Aula03;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo do produto (1, 2 ou 3):");
        int codigo = scanner.nextInt();

        switch(codigo){
            case 1:
                System.out.println("Categoria eletronicos");
                break;
            case  2:
                System.out.println("Categoria alimentos");
                break;
            case  3:
                System.out.println("Categoria vestuario");
                break;
            default:
                System.out.println("Codigo invalido");
                break;
        }
        scanner.close();    }
}
