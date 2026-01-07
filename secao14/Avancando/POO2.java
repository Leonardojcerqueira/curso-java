package secao14.Avancando;

import java.lang.reflect.*;

public class POO2 {

    public static void main(String[] args) {
         

        //1 - Classes com final
        ContaBancaria conta = new ContaBancaria(500);

        System.out.println("Saldo: " + conta.getSaldo());

        //Classe final - não pode ser herdada
        //Método final - não pode ser sobreescrito
    
        //2 - Reflection API

        try{
            Class<?> classePessoa = Class.forName("secao14.Avancando.Pessoa");


            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("João",25);

            Method metodoDizerOla = classePessoa.getMethod( "dizerOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);

            campoNome.set(pessoa, "Maria");

            metodoDizerOla.invoke(pessoa);

        } catch(Exception e) {
            e.printStackTrace();
        }
    
    }
    
}
