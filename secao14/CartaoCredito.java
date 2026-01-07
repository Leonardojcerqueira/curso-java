package secao14;

public class CartaoCredito  implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via cartão de crédito.");
    }
    
}
