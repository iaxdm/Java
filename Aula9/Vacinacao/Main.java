package Aula9.Vacinacao;
import Aula9.Pessoa;
import Aula9.Fila.Fila;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
    System.out.println("Organizando Filas");
    System.out.println("=================");
    Pessoa p1 = new Pessoa("Carlos", 58);
    Pessoa p2 = new Pessoa("Ana", 60);
    Pessoa p3 = new Pessoa("Diego", 40);
    Pessoa p4 = new Pessoa("Maria", 69);
    Pessoa p5 = new Pessoa("Jorge", 34);
    Fila filaInicial = new Fila (5);
    Fila filaPreferencial = new Fila(5);
    Fila filaNormal = new Fila(5);

    filaInicial.enqueue(p1);
    filaInicial.enqueue(p2);
    filaInicial.enqueue(p3);
    filaInicial.enqueue(p4);
    filaInicial.enqueue(p5);
    
    System.out.println();
    System.out.println("A fila está assim: "+ Arrays.toString(filaInicial.elementos));
    System.out.println();
        for(int i=0; i<filaInicial.tamanho(); i++){
            Pessoa atual = filaInicial.elementos[i];
            if(atual.getIdade() >=60){
                filaPreferencial.enqueue(atual);
            }else{
                filaNormal.enqueue(atual);
            }
        }
    }
}