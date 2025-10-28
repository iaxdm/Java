package Aula11.Embarquev2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import Aula9.Pessoa;

public class Embarque {
    public static void main(String[] args) {
        Queue<Pessoa> filaDeEntrada = new ArrayDeque<>(); //Queue é o método do Java equivalente a filas
        Deque<Pessoa> areaDeEmbarque = new ArrayDeque<>(); //Deque é o método do Java equivalente a pilhas

        filaDeEntrada.offer(new Pessoa("Luis", 28)); //offer equivale ao enqueue
        filaDeEntrada.offer(new Pessoa("David", 27));
        filaDeEntrada.offer(new Pessoa("Marco", 65));
        filaDeEntrada.offer(new Pessoa("José", 70));
        filaDeEntrada.offer(new Pessoa("Pedro", 20));
        filaDeEntrada.offer(new Pessoa("Thais", 20));
        filaDeEntrada.offer(new Pessoa("Andressa", 25));

        while(!filaDeEntrada.isEmpty()){
            System.out.println("Próxima viagem com 4 passageiros");
            for(int i = 0; i < 4 && !filaDeEntrada.isEmpty(); i++){
                System.out.println("A pessoa " + filaDeEntrada.peek().getNome() + " está embarcando");
                Pessoa p = filaDeEntrada.poll();
                areaDeEmbarque.push(p);
            }
            System.out.println("Passageiros entrando e sentando de trás para a frente");
            while (!areaDeEmbarque.isEmpty()) {
                Pessoa p = areaDeEmbarque.pop();
                System.out.println("A pessoa " + p.getNome() + " sentou no ônibus");
            }
            System.out.println("Embarque concluído");
        }
    }
}
