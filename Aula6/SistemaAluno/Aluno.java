public class Aluno {
    String nome; //Atributo 1
    int matricula; //Atributo 2
    double nota; //Atributo 3

    void verificarAprovacao(){ /*Método que realiza uma ação mais não retorna nenhum valor (toda vez que não retornar nenhum valor é usado o método void)*/
        if (nota >= 7){
            System.out.printf(nome+" está aprovado(a)!\n");
        }else{
            System.out.printf(nome+" está reprovado!\n");
        }
    }
}