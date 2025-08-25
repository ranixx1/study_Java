package ex_classes;


// A classe Sandero implementa a interface Carro
public class Sandero implements Carro {

    // Atributos
    private final int limiteDeVelocidade = 150; // velocidade máxima do carro
    private int velocidadeAtual = 0;            // velocidade atual do carro

    // Método para acelerar o carro
    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10; // aumenta a velocidade em 10 km/h
            System.out.println("Acelerando o Sandero");
        } else {
            System.out.println("Limite de velocidade atingido");
        }

        System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    // Método para frear o carro
    @Override
    public void frear() {
        System.out.println("Freando o Sandero");
    }

    // Método para parar o carro
    @Override
    public void parar() {
        System.out.println("Parando o Sandero");
    }
}

/*
 ========== COMENTÁRIOS EXPLICATIVOS ==========

 - 'implements Carro': indica que a classe está implementando a interface Carro, ou seja,
   ela é obrigada a definir os métodos: acelerar(), frear() e parar().

 - Atributos privados: É boa prática deixar atributos privados e usar métodos getter/setter se precisar acessar de fora.

 - this: se refere ao objeto atual, útil para diferenciar atributos de parâmetros/métodos locais.

 - Final no limiteDeVelocidade: como esse valor não muda, marcar como 'final' indica que ele é constante.

 - O método acelerar agora informa claramente se atingiu o limite, e imprime a velocidade atual sempre.

*/
