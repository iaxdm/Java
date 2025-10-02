import java.util.Scanner;
public class Aluno {
    String nome;
    int matricula;
    double nota;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno [] alunos = new Aluno [3];
        for(int i=0; i<alunos.length; i++){
            alunos[i]= new Aluno();

            System.out.printf("Digite o nome do %dº aluno: ", 1+i);
            alunos[i].nome = sc.next();
            System.out.printf("Digite a matrícula do %dº aluno: ", 1+i);
            alunos[i].matricula = sc.nextInt();
            System.out.printf("Digite a nota do %dº aluno: ", 1+i);
            alunos[i].nota = sc.nextDouble();
            System.out.println();
            
        }
        for(int i=0; i<alunos.length; i++){
            System.out.printf("Dados do %dº Aluno\nNome:%s\nMatrícula:%d\nNota:%.2f\n\n", 1+i, alunos[i].nome, alunos[i].matricula, alunos[i].nota);
        }
    }
}