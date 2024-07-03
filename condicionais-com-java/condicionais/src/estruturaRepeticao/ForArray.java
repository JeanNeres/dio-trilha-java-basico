package estruturaRepeticao;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"JEAN", "ANNA", "EMILLY"};

        for(int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos [x]);
        }
    }
}
