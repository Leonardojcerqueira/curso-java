package secao15;

public class Banco {

    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteExcepetion {
        if(valor > saldo) {
            //exception
            throw new SaldoInsuficienteExcepetion("Saldo insuficiente para sacar: " + valor);
        }

        saldo -= valor;

        System.out.println("Saque realizado com sucesso, de : " + valor);
    }


}
