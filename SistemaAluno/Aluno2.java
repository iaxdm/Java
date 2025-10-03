public class Aluno2 {
    String nome;
    int matricula;
    double nota;

    void verificarAprovacao(){
        if (nota >= 7){
            System.out.printf(nome+" está aprovado(a)!\n");
        }else{
            System.out.printf(nome+" está reprovado!\n");
        }
    }
}