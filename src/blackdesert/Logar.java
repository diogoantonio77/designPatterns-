package blackdesert;

public class Logar {
	private static Logar logar;
    
    private Logar(){
        System.out.println("Logando Conta");
    }
    
    public static Logar getLogar() {
        if (logar == null) {
            logar = new Logar();
        }
        return logar;
    }
}
