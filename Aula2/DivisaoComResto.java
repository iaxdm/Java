public class DivisaoComResto {
    public static void main(String[] args) {
        int totalDeItens = 60;
        int capacidadeDaCaixa = 15;
        int sobra = totalDeItens%capacidadeDaCaixa;
        int itensNaCaixa = totalDeItens/capacidadeDaCaixa;
            System.out.println("Serão preenchidas "+itensNaCaixa+" caixas"+"\n"+"Sobrarão "+sobra+" itens");
    }
}
