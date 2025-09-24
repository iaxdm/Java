public class SituacaoAluno {
    public static void main(String[] args) {
        float nota1 = 8.7f, nota2 = 6.3f, media = (nota1+nota2)/2;
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media == 10){
            System.out.println("Aprovado Parabéns");
        } else {
            System.out.println("Reprovado");
        }
    }
}
