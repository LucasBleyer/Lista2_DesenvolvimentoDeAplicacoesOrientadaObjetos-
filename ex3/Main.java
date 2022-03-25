
package ex3;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Conta Corrente: ");
        Conta contaLucas = new Corrente("Lucas Bleyer", 123, 1000);
        contaLucas.calculaRendimento();
        contaLucas.imprimeRecibo();
        
        System.out.println("");
        
        System.out.println("Conta Poupança: ");
        Conta contaPoupancaLucas = new Poupanca("Lucas Bleyer", 123, 5000);
        contaPoupancaLucas.calculaRendimento();
        contaPoupancaLucas.imprimeRecibo();
        
        
    }
}
