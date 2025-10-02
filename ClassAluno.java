public class ClassAluno {
    String nome;
    int matricula;
    double notaFinal;
    public static void main(String[] args) {
        ClassAluno aluno1 = new ClassAluno();

        aluno1.nome = "Carlos Pereira";
        aluno1.matricula = 201;
        aluno1.notaFinal = 7.5;
        System.out.println("Matrícula do aluno: "+ aluno1.matricula);
    }
}