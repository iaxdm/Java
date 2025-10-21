/*3) Crie uma classe com o nome Calculadora. Esta classe deverá conter um método para calculo das operações básicas e
retornar um valor como double.
3.1)Criar uma classe MainCalculadora com o método main com um menu com 5 opções:
1 – soma
2 – subtração
3 – multiplicação
4 – divisão
5 – sair
Entrar com os dois valores via console ou JOptionPane e exibir o resultado da operação. */

package Calculadora;

public class Calculadora {
    private double numero1, numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double soma(){
        return numero1+numero2;
    }
    public double subtração(){
        return numero1-numero2;
    }
    public double multiplicação(){
        return numero1*numero2;
    }
    public double divisão(){
        return numero1/numero2;
    }
}
