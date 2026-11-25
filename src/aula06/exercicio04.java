package aula06;

public class exercicio04 {
    public static double converterCelsiusParaFahrenheit(double celsius){
        System.out.println("Temperatura em Celsius: "+celsius);

        double conversao = celsius *1.8 + 32;
        return conversao;
    }

    static void main(String[] args) {
        double temp = converterCelsiusParaFahrenheit(22);
        System.out.println("Conversão de Celsius para Fahrenheit: "+temp);
    }
}
