import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        int qtdProdutos = 4;
        Produto [] produtos = new Produto[qtdProdutos];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<produtos.length; i++){
            produtos[i] = new Produto();
            System.out.printf("Digite o nome do %d° produto: ", 1+i);
            produtos[i].nome = sc.nextLine();

            System.out.printf("Digite o código do %d° produto: ",1+i);
            produtos[i].codigo = sc.nextInt();

            System.out.printf("Digite o preço do %d° produto: ",1+i);
          
            produtos[i].preco = sc.nextDouble();

            sc.nextLine();
            System.out.println();
        }
        sc.close();
        for (int i=0; i<produtos.length; i++){
            System.out.printf("%d° produto | %s | código %d | preço: %.2f\n", 1+i, produtos[i].nome, produtos[i].codigo, produtos[i].preco);
        }  
    }
}