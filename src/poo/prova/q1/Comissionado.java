package poo.prova.q1;

public class Comissionado extends Funcionario {
    private double vendas;

    public Comissionado(String nome, double salarioBase, double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * 0.10);
    }
}

