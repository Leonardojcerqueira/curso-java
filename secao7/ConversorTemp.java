package secao7;

import java.util.Scanner;

public class ConversorTemp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        //Saber o que o usupario quer converter
        System.out.println("Escolha o tipo de conversão");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius ");

        int escolha = scanner.nextInt();

        if (escolha == 1) {

            converterCparaF();

            
        }else if (escolha ==2){
        converterFparaC();

        }else{
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
    
    public static void converterCparaF (){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe a temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "C convertido é igual a: "  + fahrenheit + "F");
    
        scanner.close();
    }

        public static void converterFparaC (){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) *5/9;

        System.out.println(fahrenheit + "F convertido é igual a: "  + celsius + "C");
    
        scanner.close();
    }




}
