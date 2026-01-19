package poo.record;

public record Produto(String nome, double preco) {
    public double desconto() {
        return preco * 0.9;
    }

}

class Principal {

    public static void main(String[] args) {
        Produto livro = new Produto("Para todas as garotas que já amei", 28.50);
        System.out.println(livro.nome());
    }
}


// record são imutáveis