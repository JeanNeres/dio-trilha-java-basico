package controleFluxo;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 5;

        if (nota >=7){
            System.out.println("Aprovado , parabéns");
        }else if (nota >=5 && nota < 7) {

            System.out.println("Prova de recuperação");
            
        }else{
            System.out.println("Reprovado");
        }
    }
}
