package aula06;

public class exercicio05 {
    public static double calcularMedia(double nota1, double nota2, double nota3){
        System.out.println(
                "Nota 1 = "+nota1+
                " Nota 2 = "+nota2+
                " Nota 3 = "+nota3
        );

        double media = (nota1+nota2+nota3)/3;
        return media;
    }
    static void main(String[] args) {
        double mediaFinal = calcularMedia(7, 6, 8);
        System.out.println("Media final: "+  mediaFinal);
    }
}