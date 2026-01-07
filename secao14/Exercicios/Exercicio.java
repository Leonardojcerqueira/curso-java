package secao14.Exercicios;

public class Exercicio {
    
    public static void main(String[] args) {
        

        //Exercício 1 
        Endereco endereco = new Endereco("Rua teste",123, "São Paulo");

        Pessoa pessoa = new Pessoa("Matheus", 33, endereco );

        pessoa.exibirInfo();

        //Exercício 2
        Carro carro = new Carro();

        Moto moto = new Moto();

        carro.acelerar();

        moto.acelerar();

        //Exercício 3

        Cachorro bob = new Cachorro("Bob", "latido", "Poodle");

        bob.exibirDetalhes();

        // Exercício 4
        FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Ana", 4000);
        FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Pedro", 50, 120);

        System.out.println("Salario Ana " + fti.calcularSalario());

        System.out.println("Salário Pedro " + fmp.calcularSalario());

        fti.adicionarBeneficio("Plano de saúde e VA");

        fmp.adicionarBeneficio("VA");


        // Exercicio 5
        Pilotavel meuHidroAviao = new Hidroaviao();
        Navegavel meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuAviao.pilotar();

        meuHidroAviao.pilotar();

        meuBarco.navegar();

        operarVeiculo(meuAviao);
        operarVeiculo(meuHidroAviao);
        operarVeiculo(meuBarco);

    
    }

    public static void operarVeiculo(Object veiculo) {

            if (veiculo instanceof Pilotavel) {
                System.out.println("Este Veículo é pilotável");
            }

            if (veiculo instanceof Navegavel) {
                System.out.println("Este Veículo é navegável");
                
            }

        }
}
