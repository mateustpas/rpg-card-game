abstract class Habilidade{
    private int cooldownAtual;
    private int cooldown;

    Habilidade(int cooldown) {this.cooldown = cooldown;}
    boolean podeUsar() {return cooldownAtual==0;}
    void iniciarCooldown() {cooldownAtual = cooldown;}
    void reduzirCooldown() {if (cooldownAtual>0) {cooldownAtual--;}}

    abstract void usar(Personagem usuario, Personagem alvo);
}

class AtaqueEspada extends Habilidade{
    AtaqueEspada() {super(3);}
    @Override
    void usar(Personagem usuario, Personagem alvo){
        if (podeUsar()) {
            alvo.receberDano(usuario.getPoder() * 3);
            iniciarCooldown();
        }
    }
}

class Mordida extends Habilidade{
    Mordida() {super(2);}
    @Override
    void usar(Personagem usuario, Personagem alvo) {
        if (podeUsar()) {
            alvo.receberDano(usuario.getPoder() * 2);
            iniciarCooldown();
        }
    }
}

