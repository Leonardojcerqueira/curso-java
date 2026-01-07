package secao14;

abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // Abstrato: Tem que ser implementado na subclasse
    public abstract void tocar();

    //concreto: poder ser herdado
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
}
