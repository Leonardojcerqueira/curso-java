package secao20;

public class Cachorro  extends Animal{

   
    // warning não para a  compilação
    @Override
    public void emitirSom(){
        System.out.println(" O cachorro está latindo");
    }

    @SuppressWarnings("deprecation")
    public void testeMover(){
        mover();
    }




    
}
