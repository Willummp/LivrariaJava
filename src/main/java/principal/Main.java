package main.java.principal;
import main.java.domain.Cliente;
import main.java.domain.Livro;
import main.java.domain.Pedido;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Cliente cliente1 = new Cliente("Lucas", "199.368.257-06", "lsousaah@gmail.com", "Rua Jose de Alencar");
        Livro livro1 = new Livro("12345", "Heartstopper Vol1", "Alice Oseman", 12, 69.90);
        Livro livro2 = new Livro("12344", "Livro Volume 1", "Aquele", 42, 29.90);


        Pedido pedido1 = cliente1.fazPedido(livro1, 5);






















//        System.out.print("Digite seu NOME: ");
//        cliente1.setNome(scanner.nextLine()) ;
//        System.out.print("Digite seu EMAIL: ");
//        cliente1.setEmail(scanner.nextLine()) ;
//
//        System.out.println("Seu nome é " + cliente1.getNome() + " e seu Email é  " + cliente1.getEmail());
//
//
//        System.out.println("Qual livro você quer comprar?: ");
//        System.out.println("");
//
//
//        System.out.println("1- " + livro1.getTitulo()+ " de : "+ livro1.getAutor() +" Por: "+ livro1.getPreco());
//        System.out.println("2- " + livro2.getTitulo()+ " de : "+ livro2.getAutor() +" Por: "+ livro2.getPreco());
//        int livroSelecionado = Integer.parseInt(scanner.nextLine()); ;




//        if (livroSelecionado == 1){
//
//            System.out.println("Quantos livros você deseja: " );
//            System.out.println("");
//            int qtdLivros = Integer.parseInt(scanner.nextLine()); ;
//            Pedido pedido = new Pedido(livro1, qtdLivros);
//            System.out.println(pedido);
//
//        } else if (livroSelecionado == 2) {
//
//            System.out.println("Voce selecionou: " + livro1.getTitulo());
//            System.out.println("");
//            System.out.println("Quantos livros você deseja: " );
//            int qtdLivros = Integer.parseInt(scanner.nextLine()); ;
//            Pedido pedido = new Pedido(livro2, qtdLivros);
//            System.out.println(pedido);
//
//        }

    }
}