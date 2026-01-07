package secao10;

import java.util.Arrays;
import java.util.ArrayList;

public class Exercicios {

    public static void main(String[] args) {
        
        //Exercícios 1
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int [] arrayInvertido = new int [arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++){

            arrayInvertido[i] = arrayOriginal[arrayOriginal.length -1 -i];
        }

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));

        //Exercício 2 
    int [] arrayInteiros = {1, 2, 2, 3, 4, 4, 4, 5 };

    int maisFrequente = arrayInteiros[0];

    int maxContagem = 1;

    for (int i = 0; i < arrayInteiros.length; i++){

        int contagem = 0;

        for (int j = 0; j < arrayInteiros.length; j++){
            if (arrayInteiros[j] == arrayInteiros[i]) {
                contagem++;
            }
        }

        if (contagem > maxContagem) {
            maxContagem = contagem;
            maisFrequente = arrayInteiros[i];
        }



    }

    System.out.println("O mais frequente é: "+ maisFrequente);


    //Exercício 3
    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6,}
    };

    int [][] matrizTransporta= new int[matriz[0].length] [matriz.length];

    for(int [] linha : matrizTransporta){
        System.out.println(Arrays.toString(linha));
    }

    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz [0].length; j++){
            matrizTransporta[j][i] = matriz [i][j];
        }
    }

       for(int [] linha : matrizTransporta){
        System.out.println(Arrays.toString(linha));
    }

    //Exercício 4 
    int [] arrayComNegativos = {1, -2, 3, -4, 5, -6};

    System.out.println(Arrays.toString(arrayComNegativos));
    
    for(int i = 0; i < arrayComNegativos.length; i++){

        if (arrayComNegativos[i] < 0) {
            arrayComNegativos[i] = 0;
            
        }
    }

    System.out.println(Arrays.toString(arrayComNegativos));


    // Exercício 5 

    int [] arrayComDuplicados = {1, 2, 2, 2, 3, 4, 4, 5};

    //array  numerico sem qtd de elementos  definida
    ArrayList <Integer> arraySemDuplicados = new ArrayList<>();

   

    for (int numero : arrayComDuplicados) {

        if (!arraySemDuplicados.contains (numero)){
            arraySemDuplicados.add(numero);
        }
        
    }

     System.out.println(Arrays.toString(arrayComDuplicados));
     System.out.println((arraySemDuplicados));


    }
    
}
