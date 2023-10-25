package main.java.domain;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int estoque;
    private double preco;

    //CONSTRUCTOR
    public Livro(String isbn,String titulo,String autor,int estoque,double preco) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.estoque = estoque;
        this.preco = preco;
    }


    //GETTERS
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getEstoque() {
        return estoque;
    }
    public double getPreco() {
        return preco;
    }

    //SETTERS
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
