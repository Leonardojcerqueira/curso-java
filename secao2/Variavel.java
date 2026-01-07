package secao2;

public class Variavel {
    
    public static void main(String[] args) {
        
        //1 - O que são variáveis
        // tipo -> nome -> Atribuir um valor;
        String nome = "Pedro";

       //nome => "Pedro"
        System.out.println(nome);

        //2 - Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        Long  numeroGrande = 999999999999999l;

        //int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3 - Comentários

        /*
        Comentário linha 1
        Linha 2
        Linha 3

         */

        /**
         *
         * Função para somar números
         *
         * param1: Primeiro numero
         * param2: Segundo numero
         *
         * Retorno: A soma
         */

         // 4 - Strings

        String firstName = "Matheus";
        String lastName = "Battisti"; 

        System.out.println("Matheus Battisti");

        System.out.println(firstName +" " + lastName);

        System.out.println("O nome dele é: " +firstName);
        
        String fullName = firstName + " "+ lastName;

        System.out.println(fullName);

        // 5 - Char

        char letra = 'A';

        System.out.println(letra);

        String letra2 = "A";

        System.out.println(letra2);

        char simbolo = '$';

        System.out.println(simbolo);

        //6 - int
        
        int n = 42;

        System.out.println(n);

        System.out.println(n + 5);

        System.out.println(n * 10);

        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);

        //7 - Long

        long populacaoMundial = 7800000000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);

        // 8 - Double
        double preco = 19.99;

        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComd = 12.1D;

        System.out.println(valorComd);

        //9 - OP. aritmeticos p1

        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(22 +4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        //para ter um resultado quebrado (1.5), pelo menos 1 num da divisão tem  que ser double
        
        System.out.println(10 / 3);

        System.out.println(10.0 / 3);

        System.out.println(10 % 3);

        // 10 - Op. aritmetics p2
        
        int x = 5;

        x++;
        x++;
        x++;
        x++;

        System.out.println(x);

        int y = 5;

        y--;

        System.out.println(y);

        int a = 10;

        a += 5;

        System.out.println(a);

        int b = 10;

        b -= 5;

        System.out.println(b);

        b -= a;

        System.out.println(b);

        // 11 - type casting

        //implicito (widening)
        int numero2 = 42;

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        //explicito (narrowing)

        double valorDouble = 9.78;

        int valoInt = (int) valorDouble;

        System.out.println(valoInt);

        //casting de char para int;
        char letra3 = 'A';

        int codigoAscii =  (int) letra3;

        System.out.println(codigoAscii);


        // EXERCÍCIOS

        //Ex 1
        int  valorOriginal = 10;

         int valorDobrado = valorOriginal * 2;

        System.out.println(valorDobrado);

        //Ex 2
        char  varchar = 'B';
        int varInter =  (int) varchar;

        System.out.println(varInter);

        //Ex 3
        Double  double1 = 15.75;
        Double double2 = 20.40;

        Double somadouble =  double1 + double2;

        System.out.println( somadouble);

        //Ex 4
        long nlong = (2_000_000_000);

        int nint = (int) nlong;

        System.out.println(nint);

        //Ex 5
        String olaMundo = "Olá Mundo!";

        String bemVindo =  olaMundo + "Bem-vindo ao Java!";
        
        System.out.println(bemVindo);

        // 12 - constantes 
        final int DIAS_DA_SEMANA = 7;

        
        System.out.println("Dias da semana:" + DIAS_DA_SEMANA);

        //13 - var

        var  z = 10;

        System.out.println(z);

        // z = "teste"
        z = 5;

        var texto2 ="teste";

        var doubleteste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleteste);










        







    }


}
