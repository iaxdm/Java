/*1) Criar uma classe com nome Funcionario com os seguintes atributos:
▪ nome
▪ salario
Encapsular os atributos.
Inserir o construtor com todos os atributos.
Criar um método com o nome calcularInss. Este método deverá retornar um double sobre 11% do salário.
Criar um método com o nome calcularValeTransporte. Este método deverá retornar um double sobre 6% do salário.
Criar uma classe com o main e instanciar um funcionário. */


package Funcionario;

public class FuncionarioPrograma {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Caio", 2500);
        System.out.printf("Nome: %s\nSalário: %.2f\nINSS: %.2f\nVale Transporte: %.2f\nSalário Líquido: %.2f",
        funcionario.getNome(),funcionario.getSalario(), funcionario.calcularInss(), funcionario.calcularValeTransporte(),funcionario.salarioLiquido());
    }
}
