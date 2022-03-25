
package ex4;

public class FiguraGeometrica {
    protected double base;
    protected double altura;
    
    public FiguraGeometrica(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calculaArea(){
        double area = 0;
        return area;
    }
    
    public double calculaPerimetro(){
        double perimetro = 0;
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }   
}
