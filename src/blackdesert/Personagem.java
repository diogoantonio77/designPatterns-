package blackdesert;

public class Personagem {
	private Classe classe;
    private static Personagem personagem;
    private State estadoAtual;

    private Personagem() {
        estadoAtual = new StandartState();
        classe = new Umano();
    }

    public void setClasse(Classe novaClasse) {
        this.classe = novaClasse;
    }

    public Classe getClasse() {
        return classe;
    }

    public static Personagem getPersonagem() {
        if (personagem == null) {
            personagem = new Personagem();
        }
        return personagem;
    }

    public void classe() {
        classe.classe();
    }

    private void setNewState(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void entrarTerrenoRuim() {
        System.out.println("Entrando na Área maldosa");
        setNewState(new CriticalState());
    }

    public void entrarTerrenoNormal() {
        System.out.println("Entrando na Área Bondosa");
        setNewState(new StandartState());
    }
    
    public void consumirPowerUp(){
        
        System.out.println("Consumindo PowerUp");
        setNewState(new GodState());
    }

    public void mover() {
        estadoAtual.mover(classe.velocidadeDeMovimento());
    }

    public void atacar() {
        estadoAtual.atacar(classe.velocidadeDeAtaque());
    }

    public void Atributos() {
        System.out.println("Vida base:" +getClasse().vidaBase());
        System.out.println("Mana base:" +getClasse().manaBase());
        System.out.println("Velocidade de ataque base:" +getClasse().velocidadeDeAtaque());
        System.out.println("Veocidade de movimento base:" +getClasse().velocidadeDeMovimento());
    }

}
