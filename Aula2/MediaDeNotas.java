/*3. Crie uma classe MediaDeNotas. Simule a entrada de 5 notas em um laço for. Se a nota for maior que 10, use
continue para ignorá-la. Se a nota for negativa, use break para sair do loop. Calcule e imprima a média das
notas válidas. (Desafio: Use scanner e/ou vetor) */

import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double soma = 0, notasValidas = 0, media;
        
        for (int i =0; i<= 4; i++){
            System.out.print("Digite a "+(1+i)+"ª nota: ");
            float nota = scanner.nextFloat();
            if (nota > 10){
                continue;
            } else if (nota < 0){
                System.out.println("Nota inválida!");
                break;
            } else {
                soma = soma + nota; //Cada nota válida é somada com o total das notas anteriores
                notasValidas ++; //Cada nota válida adiciona 1 ao contador para saber o número de notas válidas para fazer o cálculo da média
            }
        }
        media = soma/notasValidas;
        System.out.printf("A soma das notas válidas é: %.2f%n",soma); //Quando se usa o printf %n funciona como uma quebra de linha \n
        System.out.printf("A média das notas válidas é: %.2f",media); //Quando se usa o printf se separa as variáveis e strings com vírgula (,) ao invés de (+)
        scanner.close(); //Toda vez que utilizar o scanner tem que colocar na linha de baixo scanner.close()
    }
}