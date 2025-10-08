/*2. Crie uma classe SomadorDeImpares. Use um laço for para iterar de 1 a 100. Use uma condição if para
verificar se o número atual é ímpar e adicione-o a uma variável soma. Imprima o valor final da soma. */

public class SomadorDeImpares {
    public static void main(String[] args) {
    int soma = 0;

        for (int i=1; i<=100; i++){
            if (i % 2 ==0){
                continue;
            } else {
                soma = soma + i;
            }
        }
        System.out.println("A soma entre todos os números ímpares entre 1 e 100 é "+soma);
    }
}