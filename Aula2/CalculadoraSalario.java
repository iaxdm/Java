public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "Igor";
        float salario = 1955.40f;
        if (salario <= 1751.81){
            System.out.println("Com os descontos o salário é: R$"+salario*0.92);
        }
        else if (salario <= 2919.72){
            System.out.println("Com os descontos o salário é: R$"+salario*0.91);
        }
        else if(salario <= 5839.45){
            System.out.println("Com os descontos o salário é: R$"+salario*0.90);
        }
        else{
            System.out.println("Com os descontos o salário é: R$"+salario*0.89);
        }
    }
}
