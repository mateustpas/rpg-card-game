abstract class Personagem{
    private final String nome;
    private int vida;
    private int poder;
    private Habilidade habilidade;

    Personagem(String nome, int vida, int poder, Habilidade habilidade){
        this.nome=nome; this.vida=vida; this.poder=poder; this.habilidade=habilidade;
    }

    //AÇÕES
    void atacar(Personagem alvo) {alvo.receberDano(poder);}
    void receberDano(int dano) {if (estaVivo()) {this.vida -= dano;}}
    void receberCura(int cura) {this.vida += cura;}
    void usarHabilidade(Personagem alvo) {habilidade.usar(this,alvo);}
    boolean estaVivo() {return vida>0;}

    //GET & SET NOME
    public String getNome() {return nome;}
    /*public void setNome(String nome) {this.nome = nome;}*/

    //GET & SET VIDA
    public int getVida() {return vida;}
    /*public void setVida(int vida) {this.vida = vida;}*/

    //GET & SET PODER
    public int getPoder() {return poder;}
    /*public void setPoder(int poder) {this.poder = poder;}*/

    //GET & SET HABILIDADE
    public Habilidade getHabilidade() {return habilidade;}
    /*public void setHabilidade(Habilidade habilidade) {this.habilidade = habilidade;}*/
}

class Cavaleiro extends Personagem{
    Cavaleiro(String nome, Habilidade habilidade)
    {super("Dom "+nome, 10, 2, new AtaqueEspada());}
}

class Goblin extends Personagem{
    Goblin(String nome)
    {super(nome, 5, 1, new Mordida());}
}
