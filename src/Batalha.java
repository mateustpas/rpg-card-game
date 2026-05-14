class Batalha {
    private Controlador jogador;
    private Controlador inimigo;
    private Controlador atual;

    //FLUXO DA BATALHA
    void iniciar(){
        atual = jogador;
        while(!batalhaTerminou()){
            executarTurno();
            alternarTurno();
        }

    }

    //TURNO
    void executarTurno() {
        atual.getPersonagem().getHabilidade().reduzirCooldown();
        atual.agir();
    }

    void alternarTurno(){
        atual = (atual == jogador) ? inimigo : jogador; //Se Atual é jogador, então ele vira inimigo. Se não é vira jogador.
    }

    //FIM DA BATALHA
    boolean batalhaTerminou() {return (!jogador.getPersonagem().estaVivo() || !inimigo.getPersonagem().estaVivo());}
    private Personagem getVencedor() {if (jogador.getPersonagem().estaVivo()) {return jogador.getPersonagem();} else return inimigo.getPersonagem();}
}
