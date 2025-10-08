
import java.util.Scanner;
public class Nome {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = leia.next();
        System.out.print("Olá, " + nome + "!");
        leia.close();
    }
}
