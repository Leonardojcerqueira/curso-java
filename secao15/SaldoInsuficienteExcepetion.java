package secao15;

// Toda classe que herda de exception, tem que enviar pelo menos a msg
//getMessage - > mensagem
public class SaldoInsuficienteExcepetion extends Exception {

    public SaldoInsuficienteExcepetion(String mensagem) {
        super(mensagem);
    }

}
