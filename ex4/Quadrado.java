
package ex4;

public class Quadrado extends FiguraGeometrica{
    
    public Quadrado(double base, double altura){
        super(base, altura);
    }
    
    @Override
    public double calculaArea(){
        double area;
        return area = base * altura;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro;
        return perimetro = (base * 2) + (altura * 2);
    }
}
