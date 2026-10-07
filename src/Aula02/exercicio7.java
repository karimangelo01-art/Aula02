package Aula02;

public class exercicio7 {
    static void main(String[] args) {
        boolean temSol = true;
        boolean ehfimdesemana = true;
        boolean temtrabalhoPendente = false;

        boolean vaiPraPraia = temSol && ehfimdesemana && !temtrabalhoPendente;

        boolean podeDescansar = ehfimdesemana || !temtrabalhoPendente;

        boolean diaPerfeito = (temSol && ehfimdesemana) || !temtrabalhoPendente;

        System.out.println("vai pra praia? "+vaiPraPraia);
        System.out.println("Pode descansar? "+podeDescansar);
        System.out.println("É um dia perfeito? "+diaPerfeito);

    }
}
