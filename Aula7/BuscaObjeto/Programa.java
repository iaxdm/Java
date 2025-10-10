package Aula7.BuscaObjeto;

public class Programa {
    public static void main(String[] args) {
        Item [] itens = {new Item ("Uva", 10),
                         new Item ("Maçã",8), 
                         new Item ("Pera",12),
                         new Item ("Arroz",9),
                         new Item ("Batata",12),
                         new Item ("Milho",12)};
        for (int i = 0; i <itens.length; i++){
            System.out.println("-Nome:"+itens[i].nome+" - Valor: "+itens[i].valor);
        }
        BuscarObjeto.selectionSortPorNome(itens);
        System.out.print("\n\n\n");
        for (int i = 0; i <itens.length; i++){
            System.out.println("-Nome:"+itens[i].nome+" - Valor: "+itens[i].valor);
        }
    }
}