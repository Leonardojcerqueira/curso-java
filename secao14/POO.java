package secao14;

import javax.print.attribute.standard.DocumentName;

public class POO {

    public static void main(String[] args) {
        
        //1 - Object Composition
        Motor motor1 = new Motor("v8", 450);

        Carro carro1 = new Carro( "Ford", "Mustang", motor1);

        carro1.exibirInfo();

        carro1.motor.exibirInfo();

        // 2 - Herança
        Cachorro turca = new Cachorro("Turca");

        turca.latir();

        turca.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();


        //A subclasse tem acesso a tudo da Classe superclasse
        // E a superclasse  não tem acesso a classe filha

        //3 - Classe Object 
        Pessoa matheus = new Pessoa("Matheus", 33);
        Pessoa pedro = new Pessoa("Pedro", 20);

        System.out.println(matheus.toString());

        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());

        /// 4 - Override
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());        
        System.out.println(c1.calcularArea());

    //5- Super
    Funcionario  funcionario = new Funcionario("Carlos", 3000);

    Gerente gerente = new Gerente( "Marcos", 5000, 1000);

    funcionario.exibirDetalhes();

    gerente.exibirDetalhes();

    System.out.println(funcionario.calclularBonus());

    System.out.println(gerente.calclularBonus());

    // 6 - Clasee abstrata
    InstrumentoMusical violao = new Violao("Violão");
    InstrumentoMusical bateria = new Bateria("bateria");

    violao.exibirDetalhes();
    bateria.exibirDetalhes();

    violao.tocar();
    bateria.tocar();

    //7 - interfaces
    Pagamento cartao = new CartaoCredito();
    Pagamento transf = new TransferenciaBancaria();

    cartao.processarPagamento(100);
    cartao.exibirRecibo(100);

    transf.processarPagamento(250);
    transf.exibirRecibo(250);

    // 8 - Múltiplas interfaces
    Documento doc = new Documento("Arquivo de texto");
        
        doc.salvar();

        doc.imprimir();

        doc.instrucaoParaSalvar();

        // 9 - Default methods nas interfaces

        CalculadoraAvançada calc = new CalculadoraAvançada();

       System.out.println( calc.somar(2, 4));

        System.out.println(calc.multiplicar(4, 5));


        //10 - Polimorfismo

        //Classes abstrataas ou interfaces +> sobreescrever os métodos destas superclasses
        InstrumentoMusical violino = new Violino( "Violino");

        violino.exibirDetalhes();

        violino.tocar();

    }
    

    }
    

