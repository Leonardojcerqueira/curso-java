package secao14;

public class CalculadoraAvançada  implements Calculadora{

    @Override
    public int somar( int a, int b){
        return a + b;
    }
    
    @Override
    public  int multiplicar(int a, int b) {
        System.out.println("Multiplicando...");
      return a * b;
    }
}
