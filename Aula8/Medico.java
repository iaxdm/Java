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
    }

    public void pagamentoDinheiro(double valorDaConsulta){
        salario += valorDaConsulta;
    }
    public void pagamentoPlano(double valorDaConsulta){
        salario += valorDaConsulta*0.7;
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
        this.salario = salario;
    }
    public double getValorDaConsulta() {
        return valorDaConsulta;
    }
    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }
}