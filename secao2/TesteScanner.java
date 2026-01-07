package secao2;

import java.util.Scanner;

public class TesteScanner {
    
    public static void main(String[] args) {

        //1 - Testando Scanner
        Scanner scanner = new Scanner(System.in);

        //Mensagem para o usuario entender o que precisa digitar
        System.out.println("Digite seu nome:");
        
        //Resgata o valor  do Terminal
        String nome = scanner.nextLine();
        
        //Exibe o valor
        System.out.println("Olá "+ nome + "!");

        //nextInt
        System.out.println("Digite sua idade:");

        int idade = scanner.nextInt();

        System.out.println("Sua idade é: "+ idade + "!");

        // 2 - Problema do nextLine

        System.out.println("Digite um número");



        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um Texto");

        String txt = scanner.nextLine();

        System.out.println("Os dados são. n ="+ n +" e txt = " + txt);





        // fechamento do scanner, para evitar memory leak
        scanner.close();



    }
}
