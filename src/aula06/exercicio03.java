package aula06;

public class exercicio03 {
    public static int dobrar(int numero){
        System.out.println("Numero escolhido: "+numero);

        int resultado = numero * 2;
        return resultado;
    }

    static void main(String[] args) {
        int total = dobrar(7);

        System.out.println("Dobro do numero escolhido: "+total);
    }
}
