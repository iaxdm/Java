package TimeDeFutebol;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador [] jogadores = new Jogador [3]; //Vetor jogadores da Classe jogador( que tem os atributos nome e posição), com 11 espaços
    int vagas = 0;
    int vagasOcupadas = 0;

    public TimeDeFutebol (String nomeDoTime){
        this.nomeDoTime = nomeDoTime;
    }
    public void contratarJogador (Jogador novoJogador){
        if (vagas < jogadores.length){
            jogadores [vagas] = novoJogador; //Colocando o jogador contratado na posição 0 do vetor
            vagas++; //Contabilizando mais uma vaga
            System.out.println("O jogador "+ novoJogador.nome+ " foi contratado!");
        }else{
            System.out.println("Limite de jogadores atingidos");
        }
    }
    public void exibirEscalacao(){
        System.out.println("------- ESCALAÇAO DO TIME  -------");
        for(int i=0; i < vagas; i++){
            System.out.printf("%d - Nome: %s | Posição: %s \n", 1+i, jogadores[i].nome, jogadores[i].posicao);
        }       
    }
}