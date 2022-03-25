
package ex2;

public class Cachorro extends Animal{
    public Cachorro(String nome, float peso){
        super(nome,peso);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }
}