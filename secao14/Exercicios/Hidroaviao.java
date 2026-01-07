package secao14.Exercicios;

public class Hidroaviao  extends Barco implements Pilotavel{

    @Override
    public void pilotar() {
        System.out.println("O hidroaviao está voando e depois vai navegar.");
    }
    
}
