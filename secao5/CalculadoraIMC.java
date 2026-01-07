package secao5;

import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  o seu peso:");

        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura:");

        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Seu IMC é: "+ ". Classificação: Abaixo do peso!");
            
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é: "+ ". Classificação: Peso normal!");
        }else if (imc >= 25 && imc < 29.9) {
            System.out.println("Seu IMC é: "+ ". Classificação: Sobrepeso!");
        }else {
            System.out.println("Seu IMC é: "+ ". Classificação: Obesidade!");
        }
    
        scanner.close();
    }
}
