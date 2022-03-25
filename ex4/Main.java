
package ex4;

public class Main {
    
    public static void main(String[] args) {
        
        FiguraGeometrica quadrado = new Quadrado(2, 2);
        System.out.println(quadrado.calculaArea());
        System.out.println(quadrado.calculaPerimetro());
        
        System.out.println("");
            
        FiguraGeometrica isosceles = new Triangulo(2, 4);
        System.out.println(isosceles.calculaArea());
        System.out.println(isosceles.calculaPerimetro());   
    }
}
