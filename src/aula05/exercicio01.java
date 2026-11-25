package aula05;

public class exercicio01 {
    static void main(String[] args) {
        int[] numero ={10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i<numero.length; i++){
            soma += numero[i];
        }
        System.out.println("soma total dos numeros: "+soma);
    }
}
