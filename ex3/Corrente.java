
package ex3;

public class Corrente extends Conta{
    
    public Corrente(String titular, int numero, double saldo){
        super(titular,numero,saldo);
    }
    
    @Override
    public void calculaRendimento(){
        rendimento = saldo * 0.01;
    }
}
