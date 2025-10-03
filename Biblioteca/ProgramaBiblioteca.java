package Biblioteca;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Autor machado = new Autor("Machado de Assis, brasileiro");

        Livro DomCasmurro = new Livro();
        DomCasmurro.titulo = "Dom Casmurro";
        DomCasmurro.anoPublicacao = 1899;
        DomCasmurro.autor = machado;

        System.out.println("O livro "+DomCasmurro.titulo+" foi escrito por "+DomCasmurro.autor.nome);
    }
}