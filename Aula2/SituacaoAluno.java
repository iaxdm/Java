/*1) Criar uma classe com o nome SituacaoAluno. Faça um programa com duas variáveis nota1 e nota2 com valor inicial definido.
Calcule a média e caso o valor maior ou igual a 7 deverá ser exibida a mensagem “Aprovado”.
Caso a média for menor que 7 “Reprovado” e se a media for igual 10 “Aprovado Parabéns”. */


public class SituacaoAluno {
    public static void main(String[] args) {
        float nota1 = 10f, nota2 = 5.4f, media = (nota1+nota2)/2;
        if (media == 10){ //O ideal é colocar o caso mais específico como o primeiro if para evitar erros na execução.
            System.out.println("Sua média foi: "+media+". Aprovado, parabéns");
        } else if (media >= 7){
            System.out.println("Sua média foi: "+media+". Aprovado");
        } else {
            System.out.println("Sua média foi: "+media+". Reprovado");
        }
    }
}
