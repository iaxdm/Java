/*2) Crie uma classe com o nome CalculadoraSalario defina uma variável com o nome, salário, inicialize a variável com algum valor e
exiba no console o valor do salário com desconto do INSS.

Tabela INSS
até 1.751,81 descontará 8%
entre 1.751,82 até 2.919,72 descontará 9%
entre 2.919,73 até 5.839,45 descontará 10%
Acima 5.839,456 descontará 11% */


public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "Igor";
        double salario = 2500;
        if (salario <= 1751.81){
            System.out.printf(nome+", seu salário é R$%.2f com os descontos seu salário passa para R$%.2f" ,salario, salario*0.92); // Para calcular um novo salário com desconto de 8%
        }else if (salario <= 2919.72){
            System.out.printf(nome+", seu salário é R$%.2f com os descontos seu salário passa para R$%.2f" ,salario ,salario*0.91); // Para calcular um novo salário com desconto de 9%
        }else if(salario <= 5839.45){
            System.out.printf(nome+", seu salário é R$%.2f com os descontos seu salário passa para R$%.2f" ,salario ,salario*0.90); // Para calcular um novo salário com desconto de 10%
        }else{
            System.out.printf(nome+", seu salário é R$%.2f com os descontos seu salário passa para R$%.2f" ,salario ,salario*0.89); // Para calcular um novo salário com desconto de 11%
        }
    }
}
