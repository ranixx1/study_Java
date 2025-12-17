package poo.lista2;

class Usuario {
    protected String nome;
    private String senha;
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
}

class Cliente extends Usuario {
    private String email;

    public Cliente(String nome, String senha, String email) {
        super(nome, senha);
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
}

class Funcionario extends Usuario {
    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }
    public void fecharVenda(){
        System.out.println("Eu sou um funcionário e fechei uma venda.");
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, String senha) {
        super(nome, senha);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado.");
    }

    @Override
    public void fecharVenda(){
        System.out.println("Eu sou um gerente e fechei uma venda.");
    }
}

Usuario joao = new Usuario("Joao", "123456");
Usuario jose = new Cliente("José", "abcdef", "jose@g.com");
Cliente maria = new Cliente("Maria", "abcdef", "maira@g.com");
jose.getEmail(); // Erro
maria.getEmail(); // OK
Funcionario ana = new Gerente("Ana", "abcdef");
ana.fecharVenda();
ana.fecharCaixa(); // Erro
((Gerente)ana).fecharCaixa(); // OK
if (ana instanceOf Gerente) {  // OK
    ana.fecharCaixa();
}