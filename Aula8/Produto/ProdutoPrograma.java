package Produto;

import java.util.Scanner;
public class ProdutoPrograma {
    public static void main(String[] args) {
        char escolha;
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print("Digite o nome do produto: ");
            String descricao = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            double valor = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();
            Produto produto = new Produto(descricao, valor, quantidade);
            System.out.printf("Produto: %s\nValor: R$%.2f\nQuantidade: %d\nValor Total: R$%.2f\nICMS: R$%.2f\n",
            produto.getDescricao(), produto.getValor(), produto.getQuantidade(), produto.total(), produto.calcularIcms());
            System.out.println();
            System.out.println("Deseja encerrar o programa (s/n)? ");
            escolha = sc.next().toLowerCase().charAt(0);
            if(escolha == 's'){
                System.out.println("Programa encerrado!");
            }
        }while (escolha != 's'); // Aspas simples por ser do tipo char
        sc.close();
    }
}
