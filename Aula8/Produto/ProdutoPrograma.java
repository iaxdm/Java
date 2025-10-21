package Produto;

import java.util.Scanner;
public class ProdutoPrograma {
    public static void main(String[] args) {
        char escolha;
        Scanner sc = new Scanner (System.in);
        Produto produto1 = new Produto("Arroz",25.50,2);

        do{
            System.out.printf("Produto: %s\nValor: R$%.2f\nQuantidade: %d\nValor Total: R$%.2f\nICMS: R$%.2f\n",
            produto1.getDescricao(), produto1.getValor(), produto1.getQuantidade(), produto1.total(), produto1.calcularIcms());
            System.out.println();
            System.out.println("Deseja encerrar o programa (s/n)? ");
            escolha = sc.next().toLowerCase().charAt(0);
            if(escolha == 's'){
                System.out.println("Programa encerrado!");
            }
        }while (escolha != 's');
        sc.close();
    }
}
