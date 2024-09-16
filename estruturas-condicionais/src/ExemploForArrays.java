public class ExemploForArrays {
    public static void main(String[] args) throws Exception {
        String alunos [] = {"Felipe", "Jonas","Julia", "Marcos"};

        for ( int x = 0; x < alunos.length ; x++){
            System.err.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}