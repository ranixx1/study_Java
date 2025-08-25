//classes
package ex_classes;


// O package define o diretório onde o arquivo está localizado.
// Ele organiza as classes, evita conflitos de nomes e permite agrupar classes relacionadas.

public class Classes {

    // Método principal: ponto de entrada do programa
    public static void main(String[] args) {

        // ========== 1. CLASSES E OBJETOS ==========

        // Criando objetos da interface Carro usando as implementações
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        // Criando objeto de SerVivo
        SerVivo meuSer = new Humano();
        meuSer.respirar();

        // Chamando métodos dos objetos Carro
        meuCarro.acelerar();
        meuCarro2.acelerar();

        // Tratando uma exceção: NullPointerException
        Carro meuCarroFurado = null; // Objeto não inicializado
        try {
            meuCarroFurado.acelerar(); // Tentativa de acessar método de um objeto nulo
        } catch (NullPointerException e) {
            System.out.println("Vendeu um carro furado!"); // Tratamento da exceção
        }

        // meuCarroFurado.acelerar(); // Isso causaria NullPointerException se não tratado
    }
}

/*
 ========== EXPLICAÇÃO DOS MODIFICADORES DE ACESSO ==========
 public:    acessível de qualquer lugar
 private:   acessível apenas dentro da própria classe
 protected: acessível dentro da classe e de suas subclasses
 default:   (sem modificador) acessível apenas dentro do mesmo pacote
*/

/*
 ========== CONCEITOS EXTRAS ==========

 - Polimorfismo: capacidade de um objeto assumir várias formas.
   Exemplo: um objeto do tipo Carro pode referenciar um Sandero ou um Mobi.

 - NullPointerException: ocorre quando o programa tenta acessar um objeto que está nulo (não foi inicializado).

 - RuntimeException: exceção que ocorre em tempo de execução.

 - ArithmeticException: ocorre quando há um erro aritmético, como divisão por zero.

 - Exceções: erros que ocorrem durante a execução do programa e podem ser tratados.

 - try-catch: estrutura que permite capturar e tratar exceções de forma segura.

 - throw: palavra-chave usada para lançar manualmente uma exceção.
*/
