/*2) Criar uma classe com nome Produto com os atributos abaixo:
▪ descricao
▪ valor
▪quantidade
Encapsular os atributos.
Inserir o construtor com todos os atributos.
Criar um método com o nome calcularIcms. Este método deverá retornar um double sobre 12% do total.
Criar uma classe com o método main
Instanciar os produtos até a resposta digitada for igual a ‘S’ conforme imagem abaixo.*/

package Produto;

public class Produto {
    private String descricao;
    private Double valor;
    private int quantidade;
    public Produto(String descricao, Double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        if(valor >0){
            this.valor = valor;
        }else{
            System.out.println("Valor inválido!");
        }
        
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade >0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade inválida!");
        }
    }
    public double calcularIcms(){
        return total()*0.12;
    }
    public double total(){
        return valor*quantidade ;
    }
}
