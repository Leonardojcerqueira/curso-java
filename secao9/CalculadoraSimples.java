package secao9;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {


        
        // Resgatando números 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número: ");

        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");

        double num2 = scanner.nextDouble();

        //Resgatando operação
        System.out.println("Escolha uma operação: ");
        System.out.println("1) Adição (+) ");
        System.out.println("2) Subtração(-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");


        int operacao = scanner.nextInt();


        //Realizando Calculo
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                System.out.println("Divisão por 0 não permitida! ");
                scanner.close();
                return;
                }

                break;
        
            default:
                System.out.println("Operação inválida");
                scanner.close();
                return;
        }

        //Exibição do resultado
        System.out.println("O resultado da operação é: " + resultado);


        //Fechando Scanner
        scanner.close();



    }

    //Funções para calculos
    public static double adicionar (double a, double b) {

        return a + b;

    }

    public static double subtrair (double a, double b) {

        return a - b;

    }

    public static double multiplicar (double a, double b) {

        return a * b;

    }

    public static double dividir (double a, double b) {

        return a / b;

    }


    
}
