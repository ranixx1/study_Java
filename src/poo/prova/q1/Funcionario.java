package poo.prova.q1;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario[nome=" + nome + ", salarioFinal=" + calcularSalario() + "]";
    }
}
