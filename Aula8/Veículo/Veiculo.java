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

public class Veiculo {
    String placa, tipo;
    Double valor;

    public Veiculo (String placa, String tipo, double valor){
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public double ipvaFlex(){
        return valor*0.04;
    }
    public double ipvaGas(){
        return valor*0.015;
    }
}
