package Produto;

import java.util.Scanner;
public class ProdutoPrograma {
    public static void main(String[] args) {
        char escolha;
        Scanner sc = new Scanner (System.in);
        Produto produto1 = new Produto("Arroz",25.50,2);

        System.out.printf("Produto: %s\nValor: %.2f\nQuantidade: %d\nTotal: %d\nICMS: %.2f",
        produto1.getNome(), produto1.getValor(), );
        System.out.println("Deseja encerrar o programa? ");
        escolha = sc.next().charAt(0);
    }
}
