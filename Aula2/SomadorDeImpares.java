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
