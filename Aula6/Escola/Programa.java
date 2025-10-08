package Escola;

import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {
    Escola senai = new Escola("Curso TI", 10);
    String nome;
    int mat;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    nome = sc.nextLine();
    System.out.println("Digite a matrícula do aluno: ");
    mat = sc.nextInt();

    Aluno novAluno = new Aluno(nome, mat);
    senai.matricular(novAluno);
    sc.close();

   } 
}
