package aula06;

import java.util.Scanner;

public class exemplo {
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o lado do quadrado: ");
        int lado = s.nextInt();

        int areaDoQuadrado = calcularAreaDoQuadrado(lado);
        System.out.println("Area do quadrado = "+areaDoQuadrado);

        calcularAreaDoQuadrado(lado);
    }
    public static int calcularAreaDoQuadrado(int lado){
        return lado*lado;
    }
    public static void imprimirDadosPessoais(int idade, String nome){

    }
}
