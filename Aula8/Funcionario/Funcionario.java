/*1) Criar uma classe com nome Funcionario com os seguintes atributos:
▪ nome
▪ salario
Encapsular os atributos.
Inserir o construtor com todos os atributos.
Criar um método com o nome calcularInss. Este método deverá retornar um double sobre 11% do salário.
Criar um método com o nome calcularValeTransporte. Este método deverá retornar um double sobre 6% do salário.
Criar uma classe com o main e instanciar um funcionário. */

package Funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcularInss(){
       return salario*0.11;
    }
    public double calcularValeTransporte(){
        return salario*0.06;
    }
    public double salarioLiquido(){
     return salario -calcularInss()-calcularValeTransporte();
    }
}
