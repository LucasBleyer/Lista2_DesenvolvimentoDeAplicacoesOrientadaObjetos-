package ex1;

public class Pessoa {
    protected String nome;
    protected int cpf;
    
    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void fala(){
        System.out.println("");
    }
    
    public void perfil(){
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}