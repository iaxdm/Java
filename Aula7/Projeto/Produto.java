package Aula7.Projeto;

public class Produto {
    long codigo;
    String nome, categoria;
    double preco;
    int quantidadeEmEstoque;
    int produtosCadastrados;

    public Produto (long codigo, String nome, String categoria, double preco, int quantidadeEmEstoque){

    this.codigo = codigo;
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}