//implements
package ex_classes;

// A classe Mobi implementa a interface Carro
public class Mobi implements Carro {

    // Método para acelerar o Mobi
    @Override
    public void acelerar() {
        System.out.println("Acelerando o Mobi");
    }

    // Método para frear o Mobi
    @Override
    public void frear() {
        System.out.println("Freando o Mobi");
    }

    // Método para parar o Mobi
    @Override
    public void parar() {
        System.out.println("Parando o Mobi");
    }
}

/*
 ========== NOTAS E COMENTÁRIOS ==========

 - A classe Mobi implementa todos os métodos definidos na interface Carro.

 - Cada método simplesmente imprime uma mensagem indicando a ação executada.

 - Se desejar adicionar comportamentos mais avançados (ex: velocidade, combustível),
   você pode criar atributos e lógica semelhante ao que foi feito na classe Sandero.

*/
