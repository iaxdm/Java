/*5. Crie a classe BoletimEscolar, um sistema para gerenciar as notas da turma. Utilizando JOptionPane para uma interface mais
interativa, o programa deve solicitar as 4 notas bimestrais para 3 alunos diferentes, armazenando tudo em uma matriz 3x4. Os
prompts de entrada devem ser claros (ex: "Digite a 2a nota do Aluno 1"). Ao final do preenchimento, o sistema deve calcular a
média final de cada aluno (a média de cada linha da matriz) e exibir um relatório único com o resultado de todos. */

import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main(String[] args) {
        double [][] notas = new double[3][4];
        double [] media = new double[3];
        double soma = 0;

        for (int i=0; i<notas.length; i++){
            for (int j=0; j<notas[i].length; j++){
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(1+j)+"ª nota do aluno "+(1+i)));
                soma = soma + notas[i][j];
            }
        media[i] = soma/4;
        soma = 0;
        }
        JOptionPane.showInputDialog(null, String.format("Média do aluno 1: %.2f %n Média do aluno 2: %.2f %n Média do aluno 3: %.2f", media[0], media[1], media[2]));
    }
}