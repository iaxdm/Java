public class Clinica{
    public static void main(String[] args) {
    Medico medico1 = new Medico (12345, "Ana Maria", 0, 250);
    Medico medico2 = new Medico(45678, "Antonio", 0 ,300);
    Medico medico3 = new Medico(8985, "José", 0 ,350);

    medico1.pagamentoDinheiro(medico1.getValorDaConsulta());
    medico2.pagamentoPlano(medico2.getValorDaConsulta());
    medico3.pagamentoPlano(medico3.getValorDaConsulta());

    System.out.println("Nome: "+medico1.getNome() + " | Salário: "+ medico1.getSalario());
    System.out.println("Nome: "+medico2.getNome() + " | Salário: "+ medico2.getSalario());
    System.out.println("Nome: "+medico3.getNome() + " | Salário: "+ medico3.getSalario());
    System.out.println("Total de médicos cadastrados: " + Medico.getTotalMedicos());
    }
}