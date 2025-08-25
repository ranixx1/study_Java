package exercicios.lista2;

public class Pessoa {
    String nome;
    int age;

    public Pessoa(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.age + " anos.");

    }
}
