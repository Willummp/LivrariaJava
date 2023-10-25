package main.java.domain;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String nome, String cpf, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void fazPedido(Livro livro, int exemplares){
        new Pedido(livro, exemplares);
    }


}

