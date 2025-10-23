package Aula9.Vacinacao;
import Aula9.Pessoa;
import Aula9.Fila.Fila;

public class Main {
    public static void main(String[] args) {

    System.out.println("Fila prioritária!");
    System.out.println("=================");
    Pessoa p1 = new Pessoa("Carlos", 58);
    Pessoa p2 = new Pessoa("Ana", 60);
    Pessoa p3 = new Pessoa("Diego", 40);
    Pessoa p4 = new Pessoa("Maria", 69);
    Pessoa p5 = new Pessoa("Jorge", 34);

    Fila filaPreferencial = new Fila (2);
    filaPreferencial.dequeue();
    filaPreferencial.enqueue(p4);
    filaPreferencial.enqueue(p2);

    System.out.println("A fila está assim: " + p4.toString() + " , " + p2.toString());
    filaPreferencial.dequeue();
    filaPreferencial.dequeue();
    filaPreferencial.dequeue();

    System.out.println();
    System.out.println("Fila normal!");
    System.out.println("============");
    Fila filaNormal = new Fila (3);
    filaNormal.dequeue();
    filaNormal.enqueue(p1);
    filaNormal.enqueue(p3);
    filaNormal.enqueue(p5);

    System.out.println("A fila está assim: " + p1.toString() + " , " + p3.toString() + " , " + p5.toString());
    filaNormal.dequeue();
    filaNormal.dequeue();
    filaNormal.dequeue();
    filaNormal.dequeue();
    }
}
