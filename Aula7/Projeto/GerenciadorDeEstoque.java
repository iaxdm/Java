package Aula7.Projeto;

import java.util.Scanner;
public class GerenciadorDeEstoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto [] produtos = new Produto[100];
        int escolha = 0;
        int produtosCadastrados = 0;

        System.out.println("Seja bem vindo ao Sistema de Gerenciamento de Estoque"+"\n"+("-".repeat(55)));
        do{
        
        System.out.println("1- Cadastrar produtos\n2- Buscar Produtos\n3- Listar Produtos\n4- Encerrar programa");
        System.out.println(("-".repeat(55)));
        escolha = sc.nextInt();
        sc.nextLine();


        long codigo;
        String nome, categoria;
        double preco;
        int quantidadeEmEstoque;

            switch (escolha) {
                case 1:
                    if (produtosCadastrados < produtos.length){
                        System.out.println("======CADASTRO======");
                        System.out.print("Digite o nome do produto: ");
                        nome = sc.nextLine();
                        System.out.print("Digite a categoria do produto: ");
                        categoria = sc.nextLine();
                        System.out.print("Digite o código do protudo: ");
                        codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        quantidadeEmEstoque = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite o preço do produto: R$");
                        preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.println();
                        produtosCadastrados ++;

                        
                    } else {
                        System.out.println("Limite de produtos cadastrados atingido");
                    }
                        break;
                case 2:
                
                    break;
        
                case 3:
                
                    break;
        
                case 4:
                    System.out.println("Programa encerrado!");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    break;
            }
        } while (escolha !=4);
        sc.close();
    }    
}
