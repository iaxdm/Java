package Aula7.BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[]vetor){
        int n = vetor.length;

        for (int i = 0; i< n-1; i++){
            System.out.printf("Posição i: %d\n", i);
            for(int j=0; j < n-i-1; j++){
                System.out.printf("item na posição %d é %d e item na posição %d é %d\n", j, vetor[j], j+1, vetor[j+1]);
                if(vetor[j]>vetor[j+1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1]=temp;
                    System.out.printf("-----Trocou-----\nitem na posição %d é %d e item na posição %d é %d\n", j, vetor[j], j+1, vetor[j+1]);
                }
            }
        }
    }
}
