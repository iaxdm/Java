package Biblioteca2;

public class Programa {
    public static void main(String[] args) {
    Autor JulioVerne = new Autor ("Julio Verne", "Francês");
    Livro ViagemAoCentroDaTerra = new Livro("Viagem ao centro da Terra", 1864, JulioVerne);

    System.out.printf("O livro %s foi escrito por %s, autor %s, no ano de %d", ViagemAoCentroDaTerra.titulo, ViagemAoCentroDaTerra.autor.nome,
    ViagemAoCentroDaTerra.autor.nacionalidade, ViagemAoCentroDaTerra.anoPublicacao);
    }
}
