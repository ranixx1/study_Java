package poo.record;

import java.util.List;

public record Pedido(int ID, List<Produto> itens) {
    public Pedido {
        itens = List.copyOf(itens); // garante imutabilidade
    }
}

class MainPedido {
    public static void main(String[] args) {
        List<Produto> lista = List.of(
                new Produto("Leite", 4.50),
                new Produto("Pão", 2.00),
                new Produto("Queijo", 7.80));
        System.out.println(lista);
    }
}
