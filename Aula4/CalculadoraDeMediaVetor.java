/*2. Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. Utilizando Scanner, o programa deve
solicitar as 4 notas bimestrais, armazenando-as em um vetor de double. Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais. */

import java.util.Scanner;
public class CalculadoraDeMediaVetor {
    public static void main(String[] args) {
        double media, soma = 0, notasValidas = 0;

        Scanner sc = new Scanner(System.in);
        double [] notas = new double[4];
        for (int i=0; i<notas.length; i++){
            System.out.print("Digite a nota do "+(1+i)+"º bimestre: ");
            notas [i] = sc.nextDouble();
                if(notas [i]< 0 || notas [i]> 10){
                    continue;
                } else {
                notasValidas++;
                soma = soma + notas[i];
                }
        }
        sc.close();
        System.out.println();
        media = soma / notasValidas;
        System.out.printf("A soma de todas as notas é %.2f\n",soma);
        System.out.printf("A média das notas é %.2f",media);
    }
}