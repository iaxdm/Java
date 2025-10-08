package TimeDeFutebol;

import java.util.Scanner;
public class jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        TimeDeFutebol Flamengo = new TimeDeFutebol("Flamengo");
        String nome, posicao;
        int tamanho = 3;
        
        for (int i= 0; i < tamanho; i++){
            System.out.printf("Digite o nome do %dº jogador: ", 1+i);
            nome = sc.nextLine();
            System.out.printf("Digite a posição do %dº jogador: ", 1+i);
            posicao = sc.nextLine();
            Jogador jogador = new Jogador(nome, posicao);
            Flamengo.contratarJogador(jogador);
        }

        Flamengo.exibirEscalacao();
        sc.close();
    }
} 