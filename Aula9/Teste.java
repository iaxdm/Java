package Aula9;
import Aula9.Pilha.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 25);
        Pessoa p2 = new Pessoa("Pedro", 18);

        System.out.println("---Pilha de pessoas---");
        Pessoa pilha = new Pessoa(2);
        pilha.pop();
    }
}
