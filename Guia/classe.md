# Guia Detalhado: Classes, Métodos e Objetos em Java

Este guia explica os conceitos fundamentais de **Classes**, **Atributos**, **Métodos** e **Objetos** em Java. Entender estes quatro pilares é essencial para dominar a Programação Orientada a Objetos (POO).

---

## Analogia Central: Construindo um Carro

- **Classe**: A planta ou projeto do carro.
- **Atributos**: Especificações na planta (cor, modelo, ano).
- **Métodos**: Funcionalidades descritas na planta (ligar, acelerar, frear).
- **Objeto**: O carro de verdade, construído a partir da planta.

---

## 1. Classe: O Projeto (Blueprint)

A classe é o molde que define a estrutura e o comportamento dos objetos. Ela agrupa características (**atributos**) e ações (**métodos**) relacionadas.

### Sintaxe Básica

```java
public class NomeDaClasse {
    // Corpo da classe: atributos e métodos
}
```

### Exemplo Prático: Classe Carro

```java
// Arquivo: Carro.java
public class Carro {
    // Atributos
    String modelo;
    String cor;
    int ano;
    int velocidadeAtual = 0; // O carro começa parado
    boolean ligado = false;  // O carro começa desligado

    // Métodos serão detalhados na próxima seção
}
```

---

## 2. Métodos: As Ações do Objeto

Os métodos são funções que pertencem à classe e definem o que um objeto pode fazer.

### Sintaxe do Método

```java
modificadorDeAcesso tipoDeRetorno nomeDoMetodo(tipo parametro1, tipo parametro2, ...)
```

- **modificadorDeAcesso**: Define quem pode chamar o método (ex: `public`)
- **tipoDeRetorno**: Tipo de dado retornado (`void` se não retorna nada)
- **nomeDoMetodo**: Nome da ação (ex: `acelerarCarro`)
- **Parâmetros**: Variáveis recebidas pelo método

### Exemplo Prático: Adicionando Métodos ao Carro

```java
// Arquivo: Carro.java
public class Carro {
    // ... atributos ...

    // Liga o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O " + modelo + " ligou!");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Acelera o carro
    public void acelerar(int quantidade) {
        if (ligado) {
            velocidadeAtual += quantidade;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado!");
        }
    }

    // Retorna uma descrição do carro
    public String getDescricao() {
        return "Carro: " + modelo + " | Cor: " + cor + " | Ano: " + ano;
    }
}
```

---

## 3. Objetos: A Instância Real

Um objeto é uma instância concreta de uma classe. Se a classe `Carro` é a planta, um objeto é, por exemplo, um Fusca azul de 1975.

### Instanciando Objetos

Objetos são criados com a palavra-chave `new` dentro de métodos, geralmente no `main`.

```java
Carro meuFusca = new Carro();
Carro suaFerrari = new Carro();
```

---

## 4. Usando o Objeto: Acessando Atributos e Chamando Métodos

Utilize o operador ponto (`.`) para acessar atributos e métodos do objeto.

### Exemplo Prático: Interagindo com os Carros

```java
// Arquivo: Garagem.java
public class Garagem {
    public static void main(String[] args) {
        // Instanciando objetos
        Carro meuFusca = new Carro();
        Carro suaFerrari = new Carro();

        // Modificando atributos
        meuFusca.modelo = "Fusca";
        meuFusca.cor = "Azul Celeste";
        meuFusca.ano = 1975;

        suaFerrari.modelo = "Ferrari F8";
        suaFerrari.cor = "Vermelho";
        suaFerrari.ano = 2023;

        // Chamando métodos
        meuFusca.ligar();
        meuFusca.acelerar(50);
        System.out.println(meuFusca.getDescricao());

        System.out.println("------------------------------------");

        suaFerrari.ligar();
        suaFerrari.acelerar(120);
        System.out.println(suaFerrari.getDescricao());
    }
}
```

### Saída Esperada

```
O Fusca ligou!
Acelerando... Velocidade atual: 50 km/h
Carro: Fusca | Cor: Azul Celeste | Ano: 1975
------------------------------------
O Ferrari F8 ligou!
Acelerando... Velocidade atual: 120 km/h
Carro: Ferrari F8 | Cor: Vermelho | Ano: 2023
```

---

## Resumo

- **Classe**: Define o molde dos objetos.
- **Atributos**: Características do objeto.
- **Métodos**: Ações que o objeto pode realizar.
- **Objeto**: Instância concreta da classe.

> **Dica:** Pratique criando suas próprias classes, atributos e métodos para fixar o conceito!