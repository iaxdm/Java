package Biblioteca;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Autor machado = new Autor("Machado de Assis", "brasileiro");
        Livro DomCasmurro = new Livro("Dom Casmurro", 1899, machado);
        System.out.printf("O livro %s foi escrito por %s, autor %s, no ano de %d.", DomCasmurro.titulo, DomCasmurro.autor.nome, DomCasmurro.autor.nacionalidade, DomCasmurro.anoPublicacao);
        Autor robert = new Autor("Robert Cecil Martin", "EUA");
        Livro codigoLimpo = new Livro("Código Limpo",2021, robert);
        System.out.printf("O livro '%s' foi escrito por %s", codigoLimpo.titulo, codigoLimpo.autor.nome);
    }
}