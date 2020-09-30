
package blackdesert;

public class BlackDesert {

    public static void main(String[] args) {
       
        Personagem personagem = Personagem.getPersonagem();
        
        Classe mago = new Mago();
        Classe guerreiro = new Guerreiro();
        
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(mago);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(guerreiro);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(new Bruxa());
        personagem.classe();
        personagem.Atributos();
        
        System.out.println("\nAções\n");
        personagem.mover();
        personagem.entrarTerrenoRuim();
        personagem.atacar();
        personagem.consumirPowerUp();
        personagem.atacar();
        personagem.mover();
        personagem.entrarTerrenoNormal();
        personagem.atacar();
    }
    
}
    
