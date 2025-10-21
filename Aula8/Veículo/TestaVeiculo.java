/*1) Crie uma classe com o nome Veiculo com os atributos e métodos abaixo:
atributos:
• placa
• tipo
• valor
- Construa dois objetos em uma outra classe com o nome TesteVeiculo com os seguintes dados:
LZX9090, “Flex”,20000.
KYZ1080, “Gás”,40600.
Métodos
- Crie um método para calcular o ipva para Flex 4% e para Gás 1.5% */

package Veículo;

public class TestaVeiculo {
    
    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo ("LZX9090", "Flex", 20000);
        Veiculo veiculo2 = new Veiculo("KYZ1080", "Gás", 40600);
        System.out.printf("Dados do veículo 1\nValor: %.2f\nPlaca: %s\nTipo: %s\nIPVA: %.2f\n", veiculo1.getValor(), veiculo1.getPlaca(),veiculo1.getTipo(), veiculo1.ipvaFlex());
        System.out.println();
        System.out.printf("Dados do veículo 2\nValor: %.2f\nPlaca: %s\nTipo: %s\nIPVA: %.2f\n", veiculo2.getValor(), veiculo2.getPlaca(),veiculo2.getTipo(), veiculo2.ipvaFlex());
    } 
}
