/*3. Criar uma nova classe com o nome IdentificadorDeSemestre. Crie uma variável numeroDoMes (ex: 8) e utilize o operador ternário para verificar se o
mês pertence ao "Primeiro Semestre" (de 1 a 6) ou "Segundo Semestre" e exibir o resultado. */

public class IdentificadorDeSemestre {
    public static void main(String[] args) {
        int numeroDoMes = 12;
        System.out.println(numeroDoMes <=6 ? "Estamos no primeiro semestre" : "Estamos no segundo semestre");
    }
}
