package secao4;
 
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        
        //Exercicio 1
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite o preço do produto:");

        //double preco = scanner.nextDouble();

        //if (preco < 50) {
        //    System.out.println("Categoria: Barato");
       // }else if(preco >= 50 && preco<=100){
        //    System.out.println("Categoria: Médio");
        //} else {
        //    System.out.println("Categoria: Caro");
        //}


        // Exercício 2
        //System.out.println("Digite o nome do usuário");

        //String usuario = scanner.next();

        //System.out.println("Digite a senha do usuário");

        //String senha = scanner.next();

        //String=> equals
       // if(usuario.equals("admin")&& senha.equals("1234")) {
      //  System.out.println("Acesso permitido");
      //  } else{
      //      System.out.println("Acesso Negado");
      //  }

        //Exercício 3
       // System.out.println("Digite um número");

    //int numero = scanner.nextInt();

        //12 / = 6 -> Resto 0;
        //13 / = 6 -> Resto 1;
        //String resultado = "";

        //if (numero % 2 == 0){
        //    resultado = "Par";

        //}else {
        //resultado = "Impar";
        //}

        //System.out.println("O numero é: "+ resultado);

        //Exercício 4
       // System.out.println("Insira um número de 1 a 7 (referente ao dia da semana) ");
        
      //  int dia = scanner.nextInt();

       // switch (dia) {
        // case 1:
        //case 7:
       //System.out.println("Final de Semana");
           //break;
        //case 2:
        // case 3:
        //case 4:
        //case 5:
        //case 6:
        //System.out.println("Dia de Semana");
        //break;

        //default:
        //System.out.println("Número inválido!");
        //break;
       // }

       //Exercício 5
        
        System.out.println("Digite um  número:");
        int numero = scanner.nextInt();

    if (numero >=10 && numero <= 20 ){
        System.out.println("Dentro do intervalo");
    } else {
        System.out.println("fora do intervalo");
    }

    // Exercício 6
    System.out.println("Insira uma letra:");

    //equalsIgnoreCase ou ToLowerCase
    char letra = scanner.next(). toLowerCase(). charAt(0);

    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Vogal");
        break;
        default:
        System.out.println("Consoante");
        break;
    }



    


        scanner.close();

    }
    
}
