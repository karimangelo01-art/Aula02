package Aula03;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da compra: R$");
        double valorCompra = sc.nextDouble();
        double desconto = (valorCompra/100) * 10;
        double valorfinal  = valorCompra - desconto;
        if (valorCompra >= 100){
            System.out.println("Total a pagar apos desconto: RS"+valorfinal);
            System.out.println("Desconto de: R$"+desconto);;
        } else{
            System.out.println("total a pagar: RS:"+valorCompra);
        }


    }
}