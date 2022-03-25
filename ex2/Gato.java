package ex2;

public class Gato extends Animal {
    
    public Gato(String nome, float peso){
        super(nome,peso);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miaaaaaaaaaaau");
    }
}
