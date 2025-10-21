/*3) Crie uma classe com o nome Calculadora. Esta classe deverá conter um método para calculo das operações básicas e
retornar um valor como double.
3.1)Criar uma classe MainCalculadora com o método main com um menu com 5 opções:
1 – soma
2 – subtração
3 – multiplicação
4 – divisão
5 – sair
Entrar com os dois valores via console ou JOptionPane e exibir o resultado da operação. */

package Calculadora;

import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

            System.out.println("--------------CALCULADORA JAVA---------------");
        do{
            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();
            Calculadora calcular = new Calculadora(numero1, numero2);
            System.out.print("----------Escolha a operação----------\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair do programa\n");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f",numero1, numero2, calcular.soma());
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f",numero1, numero2, calcular.subtração());
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f",numero1, numero2, calcular.multiplicação());
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("%.2f / %.2f = %.2f",numero1, numero2, calcular.divisão());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Encerrando o programa!");

                default:
                    break;
            }
        }while(escolha != 5);
        sc.close();
    }
}
