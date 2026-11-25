package aula04;

public class exercicio01 {
    static void main(String[] args) {
        for (int numero = 10; numero >=1; numero-- ){
            if (numero == 0){
                break;
            }
            System.out.println(numero);
        }
        System.out.println("cabo");
    }
}
