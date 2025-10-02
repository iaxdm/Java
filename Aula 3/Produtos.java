import java.util.Scanner;
public class Produtos {
String nome;
int codigo;
double preco;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto1= new Produtos();
        System.out.print("Digite o nome do produto: ");
        produto1.nome=sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        produto1.preco=sc.nextDouble();
        System.out.print("Digite o código do produto: ");
        produto1.codigo=sc.nextInt();
        sc.close();
    }
}