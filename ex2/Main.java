
package ex2;

public class Main {
    
    public static void main(String[] args) {
        Gato gato1 = new Gato("Gatinho",3);
        System.out.println(gato1.getNome());
        gato1.emitirSom();
        
        System.out.println("");
        
        Cachorro cachorro1 = new Cachorro("Layla",15);
        System.out.println(cachorro1.getNome());
        cachorro1.emitirSom();
    }
}
