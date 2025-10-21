public class Medico{
    private long crm;
    private String nome;
    private double salario=0, valorDaConsulta;
    private static int totalMedicos;

    public Medico(long crm, String nome, double salario, double valorDaConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorDaConsulta = valorDaConsulta;
        totalMedicos += 1;
    }

    public void pagamentoDinheiro(){
        this.salario += this.valorDaConsulta;
    }
    public void pagamentoPlano(){
        this.salario += this.valorDaConsulta*0.8;
    }
   
    public long getCrm() {
        return crm;
    }
    public static int getTotalMedicos() {
        return totalMedicos;
    }
    public static void setTotalMedicos(int totalMedicos) {
        Medico.totalMedicos = totalMedicos;
    }
    public void setCrm(long crm) {
        this.crm = crm;
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
        if (salario > 0){
        this.salario = salario;
        }else {
            System.out.println("Salário não pode ser negativo");
        }
    }
    public double getValorDaConsulta() {
        return valorDaConsulta;
    }
    public void setValorDaConsulta(double valorDaConsulta) {
        if(valorDaConsulta > 0){
        this.valorDaConsulta = valorDaConsulta;
        }else{
            System.out.println("Valor da consulta não pode ser negativo");
        }
    }
}