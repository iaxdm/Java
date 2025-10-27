package Aula9.Triagem;
import Aula9.Pessoa;
import Aula9.FilaCircular.FilaCircular;

import java.util.Arrays;

public class Triagem {
    public static void main(String[] args) {
        
    System.out.println("Organizando Filas");
    System.out.println("=================");
    Pessoa p1 = new Pessoa("Carlos", 58);
    Pessoa p2 = new Pessoa("Ana", 60);
    Pessoa p3 = new Pessoa("Diego", 40);
    Pessoa p4 = new Pessoa("Maria", 69);
    Pessoa p5 = new Pessoa("Jorge", 34);
    FilaCircular filaInicial = new FilaCircular(5);
    FilaCircular filaPreferencial = new FilaCircular(5);
    FilaCircular filaNormal = new FilaCircular(5);

    filaInicial.enqueue(p1);
    filaInicial.enqueue(p2);
    filaInicial.enqueue(p3);
    filaInicial.enqueue(p4);
    filaInicial.enqueue(p5);
    
   
    }
}