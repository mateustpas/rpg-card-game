abstract class Controlador {
    private Personagem personagem;

    abstract void agir();
    Personagem getPersonagem() {return personagem;}
}

class Jogador extends Controlador{
    private String nick;

    @Override
    void agir() {}
}

class Inimigo extends Controlador{
    @Override
    void agir() {}
}
