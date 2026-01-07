package secao14;

public class Gerente extends Funcionario {

    private double bonusAdicional;

    public Gerente(String nome,double salario, double bonusAdicional) {
        super(nome, salario);

        this.bonusAdicional = bonusAdicional;
    }
    
    @Override
    public double calclularBonus() {
        return super.calclularBonus() + bonusAdicional;
    }

    public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Bonus adicional de: " + bonusAdicional);
    }

}
