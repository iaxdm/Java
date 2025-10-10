package Aula7.InsertionSort;

public class InsertionSort {
    public static void InsertionSort(int [] vetor) {
        for(int i=1; i <vetor.length; i++){
            int chave = vetor[i];
            System.out.println("Essa é a chave "+chave);
            int j = i - 1;
            while (j<=0 && vetor[j]>chave) {
                System.out.printf("Substituiu o vetor [%d] - %d pelo vetor [%d] - %d",1+j, vetor[j+1], j, vetor[j]);
                vetor[j+1]= vetor[j];
                j = j-1;
            }
            vetor[j+1]= chave;
        }
    }
}