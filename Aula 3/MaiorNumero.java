/*3. Crie uma classe MaiorNumero que analise um conjunto de pontuações. Peça ao usuário para inserir 6 números inteiros, que
podem representar pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor, processe
os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado. */

import java.util.Scanner;


public class MaiorNumero {
    public static void main(String[] args) {
        int maior, posicao;
        
        Scanner sc = new Scanner (System.in);
        int [] pontucoes = new int [6];
        for (int i=0; i<pontucoes.length; i++){
            System.out.print("Digite o "+(1+i)+"° número: ");
            pontucoes[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        maior = pontucoes[0];
        posicao = pontucoes [0];
        for (int i=0; i<pontucoes.length; i++){
            if(pontucoes[i] > maior){
                maior = pontucoes[i];
                posicao = i;
            }
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O maior número está na posição: "+(posicao+1)); //Adicionei +1 para facilitar a leitura para o usuário, pela lógica o correto seria apenas indicar a posição, sendo [0] a primeira
    }
}