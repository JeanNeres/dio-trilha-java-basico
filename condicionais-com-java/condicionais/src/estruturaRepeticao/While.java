package estruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While{
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
                    Double valorDoce = ValorAleatorio();
                    if (valorDoce > mesada)
                        valorDoce = mesada;
        

            System.out.println("Docec do valor " + valorDoce + " Adicionado no carrinho" );
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozsinho gastou toda a sua mesada em doces");
    }

    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}


