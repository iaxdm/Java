package Aula9.Vacinacao;
import Aula9.Pessoa;
import Aula9.Fila.Fila;

public class Main {
    public static void main(String[] args) {
    Pessoa [] elementos;

    System.out.println("Vamos fazer uma fila");
    System.out.println("====================");
    Pessoa p1 = new Pessoa("Carlos", 58);
    Pessoa p2 = new Pessoa("Ana", 60);
    Pessoa p3 = new Pessoa("Diego", 40);
    Pessoa p4 = new Pessoa("Maria", 69);
    Pessoa p5 = new Pessoa("Jorge", 34);

    Fila fila = new Fila (5);
    Fila filaPreferencial = new Fila (5);
    Fila filaNormal = new Fila (5);
    
    fila.enqueue(p1);
    fila.enqueue(p2);
    fila.enqueue(p3);
    fila.enqueue(p4);
    fila.enqueue(p5);

    System.out.println("A fila está assim: " + fila.toString());
    System.out.println();
        for(int i=0; i<elementos.length; i++){
            if(elementos[i].getIdade()>=60){

            }
        }
    }
}
