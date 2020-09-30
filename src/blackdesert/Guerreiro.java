package blackdesert;

public class Guerreiro implements Classe{
    public void classe(){
        System.out.println("Classe seleciona: Guerreiro");
    }
    
    public float vidaBase(){
        return 300;
    }
    
    public float manaBase(){
        return 0;
    }
    
    public float velocidadeDeAtaque(){
        return 8;
    }
    
    public float velocidadeDeMovimento(){
        return 400;
     }
}
