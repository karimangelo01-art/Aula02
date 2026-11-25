package aula04;

public class exercicio02 {
    static void main(String[] args) {
    int soma = 0;
    int numero =1;

    while(numero <=100){
        if (numero %2 == 0){
            soma += numero;
        }
        numero++;
        System.out.println("soma de todos os pares: "+soma);
        //System.out.println(numero);
    }
    }
}
