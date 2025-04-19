//HERANÇA
package src.ex_classes;

// A classe Humano herda de SerVivo usando herança
public class Humano extends SerVivo {

    // Atributo da classe Humano
    public String name;

    // Construtor da classe Humano
    public Humano() {
        super(42); // Chama o construtor da classe pai (SerVivo) com idade 42
        this.name = "Ranilton";
    }

    // Implementação do método abstrato da classe SerVivo
    @Override
    public void respirar() {
        System.out.println("Respirando...");
    }
}

/*
 ========== EXPLICAÇÃO ==========

 - Herança: permite que uma classe herde atributos e métodos de outra.
   Aqui, Humano herda tudo que SerVivo tem (exceto os private).

 - super(): usada para chamar o construtor da classe pai.
   O valor 42 está sendo passado como idade para SerVivo.

 - @Override: indica que o método está sobrescrevendo uma versão da classe pai.
   Isso é obrigatório ao implementar métodos abstratos.

 - Atributos públicos (como 'name') podem ser acessados de fora da classe, mas geralmente é melhor usar encapsulamento (private + getters/setters).
*/
