package secao4;

public class CondicionaisDois {
    
    public static void main(String[] args) {
        
        // 1 - Condicional Ternária
        int numero = 11;

        String resultado =(numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        //CONDIÇÃO X > 5 ? EXPRESSAO SE É TRUE "OK" ? EXPRESSÃO SE É FALSE "Não OK"
    
       // 2 - if encadeado
        int idade = 16;
        boolean temCarteira = false;

        if(idade >= 18){

            if (temCarteira) {
                System.out.println("Pode dirigir");
            } else{
                System.out.println("Precisa te Habilitação para dirigir!");
            }

        } else{
            System.out.println("Você não pode dirigir ainda!");
        }

        //3 - Precedencia
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        //TRUE OU FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        boolean resultado4 = !(a || b) && c;
        
        // NOT (TRUE OU FALSE)  =>NOT(TRUE) => FALSE AND TRUE => FALSE
        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;

        //(NOT TURE OR FALSE ) AND TRUE
        //(FALSE OR FALSE) AND TRUE
        //FALSE
        System.out.println(resultado5);


    
    }


}
