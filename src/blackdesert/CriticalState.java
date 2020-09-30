package blackdesert;

public class CriticalState implements State{
	  @Override
	    public void atacar(float velocidadeAtaque) {
	        System.out.println("Atacando na velocidade " + (velocidadeAtaque - 0.3));
	    }

	    @Override
	    public void mover(float velocidadeDeMovimento) {
	        System.out.println("Movendo na velocidade "+ (float)(velocidadeDeMovimento - 50));
	    } 
}
