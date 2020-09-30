package blackdesert;

public class GodState implements State {
	    public void atacar(float velocidadeAtaque) {
	        System.out.println("Atacando na velocidade " + (velocidadeAtaque + 1));
	    }

	    public void mover(float velocidadeDeMovimento) {
	        System.out.println("Movendo Super Rapido na velocidade "+ (velocidadeDeMovimento + 50));
	    } 
}
