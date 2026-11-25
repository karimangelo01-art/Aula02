package aula06;

public class exercicio02 {
    public static int soma(int valor1, int valor2){
        System.out.println("Primeiro valor: "+valor1);
        System.out.println("Segundo valor: "+valor2);

        int resultado = valor1 + valor2;
        return resultado;
    }

    static void main(String[] args) {
        int total = soma(10, 5);

        System.out.println("soma dos valores = "+total
        );
    }
}
