//Busca Sequencial

package Aula7.Buscador;

public class Buscador {
    public static int buscaSequencial(int[] vetor, int busca){ // retorna um inteiro
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] == busca){
                return i;
            }
        }
        return -1;
    }
    public static int buscaBinaria(int[] vetor, int busca){
        int inicio = 0;
        int fim = vetor.length-1;
        while(inicio <= fim){
            int meio = inicio + (fim - inicio)/2;
            System.out.printf("O %d é o iníio, o %d é o meio, o %d é o fim\n",inicio, meio, fim);

            if(vetor[meio] == busca){
                return meio;
            }

            if(busca < vetor[meio]){
                fim = meio - 1;
            } else {
                inicio = meio + 1; 
            }
        }
        return -1;
    }
}
