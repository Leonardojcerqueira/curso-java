package secao6;

public class ExerciciosFuncoes {

    public static void main(String[] args) {
        
    

    //Exercício 1
    double celsius = 25.0;
    double fahrenheit = converterTemperatura(celsius);
    System.out.println("A temperatura de " + celsius + "C é equivalente a " + fahrenheit + "F");
    
    // Exercício 2 
    System.out.println("O fatorial de 10 é: " + calcularFatorial(10));

    //Exercício 3
    System.out.println(verificarParidedade(10));
    System.out.println(verificarParidedade(101));

    //Exercício 4
    System.out.println(classificarNota(11));
    System.out.println(classificarNota(10));
    System.out.println(classificarNota(8));
    System.out.println(classificarNota(3));

    //Exercício 5
    verificaIdade(12);

    verificaIdade(44);

    //Exercício 6
    int[] numeros = {10, 5, 44, 5};

    System.out.println(encontrarMaior(numeros));


}
    
    //Funções
    public static double converterTemperatura (double celsius){

        return(celsius * 9/5) + 32;
    }

    public static int calcularFatorial ( int numero){

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static  String verificarParidedade(int x) {

        if (x % 2 == 0 ) {
            return "O número " + x  + " é par!";
            
        } else {
            return "O número " + x  + " NÃO é par!";
        }
    }

    public static String classificarNota (int nota) {

        if (nota < 0 || nota > 10) {
            return "Nota inválida";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void verificaIdade  (int idade) {

        if (idade < 18) {
            System.out.println("Acesso Negado!");
            System.exit(0);
        }

        System.out.println("Acesso permitido!");
    }

    public static int encontrarMaior(int [] numeros) {

        int maior = numeros [0];

        // Contador, cond, execução, Incremento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
