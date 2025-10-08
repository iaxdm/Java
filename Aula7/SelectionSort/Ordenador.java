package Aula7.SelectionSort;

public class Ordenador {
    public static void bubbleSort(int[] vetor){
        public static void selectionSort(int[] vetor){
            int n = vetor.length;
            for(int i = 0; i<n-1; i++){
                System.out.printf("Posição i: %d \n", i);
                int indiceDoMenor = i;
                for(int j = i+1; j<n; j++){
                    if(vetor[j] < vetor[indiceDoMenor]){
                        System.out.printf("O número selecionado (j) é o %d - %d o número no indideDoMenor é %d - %d\n", j, vetor[j],
                        indiceDoMenor, vetor[indiceDoMenor]);
                        indiceDoMenor = j;
                    }
                }
            }
        }
    }
}