package secao12;

public class Pessoa {

    private String nome;
    private int idade;
    
    public void setNome (String nome) {
        // THIS -> OBJETO
        this.nome = nome;
    }


    public String getNome () {
        return nome;
    }

        public void setIdade (int idade) {
        // THIS -> OBJETO
        // this = este objeto 
        this.idade = idade;
    }


    public int  getIdade () {
        return idade;
    }



}
