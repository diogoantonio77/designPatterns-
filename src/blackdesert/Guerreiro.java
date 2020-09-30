/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackdesert;

/**
 *
 * @author diogo
 */
public class Guerreiro {
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
