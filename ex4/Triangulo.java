
package ex4;

public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(double base, double altura){
        super(base, altura);
    }
    
    @Override
    public double calculaArea(){
        double area;
        return area = (base * altura) / 2;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro;
        return perimetro = base + altura + altura;
    }
}
