/*3. Crie uma classe MediaDeNotas. Simule a entrada de 5 notas em um laço for. Se a nota for maior que 10, use
continue para ignorá-la. Se a nota for negativa, use break para sair do loop. Calcule e imprima a média das
notas válidas. (Desafio: Use scanner e/ou vetor) */

import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        float soma = 0;
        int notasValidas = 0;
        
        for (int i =0; i<= 4; i++){
            System.out.print("Digite a "+(1+i)+"ª nota: ");
            float nota = scanner.nextFloat();
            if (nota > 10){
                continue;
            } else if (nota < 0){
                System.out.println("Nota inválida!");
                break;
            } else {
                soma = soma + nota;
                notasValidas ++;
            }
        }
        System.out.println("A soma das notas válidas é: "+soma+"\nA média das notas válidas é: "+soma/notasValidas);
    }
}
