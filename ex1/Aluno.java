package ex1;

public class Aluno extends Pessoa{
    private int matricula;
    private double bolsa;
    
    public Aluno(String nome, int cpf, int matricula, double bolsa){
        super(nome,cpf);
        this.matricula = matricula;
        this.bolsa = bolsa;
    }
    
    @Override
    public void fala(){
        System.out.println("Professor, não entendi!");
    }
    
    @Override
    public void perfil(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Matricula: "+matricula);
        System.out.println("Bolsa: "+bolsa);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
