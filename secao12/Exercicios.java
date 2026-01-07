package secao12;

public class Exercicios {


    // 1 - Exercício 

    public static void main(String[] args) {
        
        

    Celular iphone = new Celular();


    iphone.marca = "Apple";
    iphone.modelo = "Iphone 15";

    iphone.ligar();

    iphone.desligar();

    iphone.usar(10);

    Celular s10 = new Celular();


    iphone.marca = "Samsung";
    iphone.modelo = "S10";

    s10.usar(15);

    //Exercício 2 
    Aluno pedro = new Aluno ("Pedro", 123, 33.3);

    System.out.println(pedro.getNome());
    System.out.println(pedro.getNotaFinal());
    
    pedro.setNome("Pedro Alves");

    pedro.setNotaFinal(50.0);

    pedro.exibirInfo();

    Aluno maria = new Aluno ("Maria", 1234, 99.9);

    maria.exibirInfo();

    //Exercicio 3 com ERRO

    //Exercício 4
    ProdutoEletronico microondas = new ProdutoEletronico("Mircoondas", 400, 12);

     microondas.aplicarDesconto(15);

     microondas.exibirInfo();

     // Exercício 5
     LivroBiblioteca livro1 = new LivroBiblioteca();

     livro1.setTitulo("Java: Como Programar");

     livro1.devolver();

     livro1.pegarEmprestado();

     livro1.pegarEmprestado();

     livro1.devolver();


    }
}


