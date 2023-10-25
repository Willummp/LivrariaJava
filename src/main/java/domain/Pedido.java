package main.java.domain;

public class Pedido {
    private String numpedido;
    private Livro livro;
    private Cliente cliente;
    private int exemplares;
    private double total;

    //CONSTRUCTOR
    public Pedido(Livro livro, int exemplares ) {
        this.livro = livro;
        this.exemplares = exemplares;

    }


}
