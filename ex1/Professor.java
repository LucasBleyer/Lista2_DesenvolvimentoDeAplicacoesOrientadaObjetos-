package ex1;

public class Professor extends Pessoa{
    private int siape;
    private double salario;
     
    public Professor(String nome, int cpf, int siape, double salario){
        super(nome, cpf);
        this.siape = siape;
        this.salario = salario;   
    }
     
    @Override
    public void fala(){
        System.out.println("Alguma dúvida?");
    }
    
    @Override
    public void perfil(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Siape: "+siape);
        System.out.println("Salario: "+salario);
    }
    
    public int getSiape(){
        return siape;
    }
     
    public void setSiape(int siape){
        this.siape = siape;
    }
     
    public double getSalario(){
        return salario;
    }
     
    public void setSalario(double salario){
        this.salario = salario;
    }
     
}
