
package ex3;

public class Poupanca extends Conta{
    
    public Poupanca(String titular, int numero, double saldo){
        super(titular,numero,saldo);
    }
    
    @Override
    public void calculaRendimento(){
        rendimento = saldo * 0.05;
    }
}
