package aula05;

public class exercicio04 {
    static void main(String[] args) {
        double[] nota = {5.5, 7.7, 5.0, 8.0};
        double soma = 0;

        for (int i = 0; i<nota.length; i++){
            soma += (nota[i])/4;
        }
        System.out.println("Media do aluno: "+soma);
    }
}
