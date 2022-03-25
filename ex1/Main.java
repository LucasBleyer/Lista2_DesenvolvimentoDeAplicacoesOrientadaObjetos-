
package ex1;

public class Main {
    
    public static void main(String[] args) {
        Professor prof1 = new Professor("Fernando", 123, 444, 3000);
        prof1.perfil();
        prof1.fala();
        
        System.out.println(" ");
        
        Aluno aluno1 = new Aluno("Lucas", 321, 20210421, 600);
        aluno1.perfil();
        aluno1.fala();
    }
}
