package secao14;

public class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println(nome + " Está emitindo um som.");
    }

    
}
