
package ex2;

public class Animal {
   protected String nome;
   protected float peso;
   
   public Animal(String nome, float peso){
      this.nome = nome;
      this.peso = peso;
   } 
   
   public void fazerExercicio(){
       peso -= 1;
   }
   
   public void emitirSom(){
       System.out.println("aaaarrrghhhhhh");
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
