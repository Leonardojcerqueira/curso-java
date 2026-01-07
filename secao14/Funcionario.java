package secao14;

public class Funcionario {

    protected String nome;
    protected  double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome de funcionario: " + nome);
    }

    public double calclularBonus() {
        return salario * .1;
    }
    
}
