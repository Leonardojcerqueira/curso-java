package secao20;

import java.lang.annotation.*;


    @Retention(RetentionPolicy.RUNTIME)// Em tempo de execução
    @Target(ElementType.METHOD)//aplicada em métodos 
    @interface Executar{
        int vezes() default 1;

    }


    

