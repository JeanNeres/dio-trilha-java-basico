package estruturaRepeticao;

public class ForEach {
    public static void main(String[] args) {
        String alunos[] = {"JEAN", "ANNA", "EMILLY"};

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " +  aluno);
        }
    }
}
