package Metodos.ExercitandoMetodos;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        System.out.println("Volume Atual: " + smartTv.volume);


        
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        smartTv.avancandoCanal();
        smartTv.avancandoCanal();
        smartTv.avancandoCanal();
        smartTv.voltandoCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status Tv Ligada? " + smartTv.ligada);
        System.out.println("Qual Canal Atual? " + smartTv.canal + " - Globo");
        System.out.println("Qual o Volume Atual: " + smartTv.volume);
    }
    
}
