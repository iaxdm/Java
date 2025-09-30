/*1. Crie uma classe chamada ListaDeCompras que funcione como um assistente pessoal. O programa deve solicitar ao usuário, via
Scanner, que digite 5 itens de supermercado. Armazene cada item em um vetor de String e, ao final, exiba a lista completa de
forma organizada no console. */

import java.util.Scanner;  //Toda vez que usar o Scanner é preciso importar a biblioteca
public class ListaDeCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); //Toda vez que usar o Scanner é preciso declarar
        String [] itens = new String [5];
        System.out.println("Vamos fazer uma lista de compras!"+"\n");
        for (int i=0; i<itens.length; i++){
            System.out.print("Digite o "+(1+i)+"º item da lista de compras: ");
            itens[i] = scanner.nextLine(); // Para ler um scanner da classe string
        }
        System.out.println();
        scanner.close();
        
        for (int i=0; i<itens.length; i++){
            System.out.println((1+i)+" - "+itens[i]);
        }
    }
}