package secao6;

public class FuncoesBuiltln {

    public static void main(String[] args) {
        
        // 10 - Funçoes built in de String
        String frase = "Java é muito bom!";

        // length
        System.out.println(frase.length());

        //int => inteiro
        //String => S =>letra  maiuscula inicial => classe

        System.out.println(frase.substring(0, 4));

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("a", "e"));

        String fraseModificada = frase.toUpperCase();

        System.out.println(fraseModificada.toLowerCase());

        // 11 - Funções de Math

        System.out.println(Math.sqrt(26));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));
        
        System.out.println(Math.max(100, 10));

        double raizQuadrada = Math.sqrt(99);

        System.out.println("A raíz quadrada de 99 é: " + raizQuadrada );

    }
    
}
