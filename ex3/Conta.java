
package ex3;

public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;
    protected double rendimento;
    
    public Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public double depositar(double valor){
        return saldo += valor;
    }
    
    public void sacar(double valor){
        if (valor < saldo)
        {
            saldo -= valor;
        }else{
            System.out.println("Operação Bloqueada!");
        }
    }
    
    public void imprimeRecibo(){
        System.out.println("Titular ----------- "+titular);
        System.out.println("Número ------------ "+numero);
        System.out.println("Saldo ------------- "+saldo);
        System.out.println("Rendimento -------- "+rendimento);
    }
    
    public void calculaRendimento(){
        rendimento = saldo * 1;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
