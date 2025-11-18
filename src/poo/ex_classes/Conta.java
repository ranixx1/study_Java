package poo.ex_classes;

public class Conta {
    private double saldo;
    private int numero;
    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0.0;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public boolean depositar(double valor){
        if(valor>0){
            this.saldo +=valor;
            return true;
        }
        return false;
    
    }
    public boolean sacar(double valor){
        if(valor >0.0 && valor <= this.saldo){
            this.saldo-=valor;
            return true;
        }
        return false;

    }
    public boolean transferir(Conta destino,double valor){
        Conta minhaConta = this;
        if(minhaConta.sacar(valor)){
            if(destino.depositar(valor)){
                return true;
            }
            minhaConta.depositar(valor);
            return false;
        }
        return false;


    }
    
}
