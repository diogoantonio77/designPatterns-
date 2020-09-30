package blackdesert;

public class Umano implements Classe{
	public void classe(){
        System.out.println("Classe Inicial Umano");
    }

    @Override
    public float vidaBase() {
        return 50;
    }

    @Override
    public float manaBase() {
        return 50;
    }
    @Override
    public float velocidadeDeAtaque(){
        return (float) 0.5;
    }
    @Override
    public float velocidadeDeMovimento() {
        return 300;
    }
}
