import produto.*;
import venda.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Mouse Gamer", 150.0, "Óptico", "Mouse óptico com LED RGB");
        Mouse mouse2 = new Mouse("Mouse Sem Fio", 100.0, "Wireless", "Mouse sem fio com bateria recarregável");

        Livro livro1 = new Livro("Java Básico", 90.0, "João Silva", "Educação");
        Livro livro2 = new Livro("POO em Java", 120.0, "Maria Souza", "Programação");

        List<Produtos> listaInicial = new ArrayList<>();
        Carrinho carrinho = new Carrinho(listaInicial, 0.0);

        List<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(mouse1);
        listaProdutos.add(livro1);
        carrinho.vender(listaProdutos);

        System.out.println("Venda 1:");
        System.out.println(carrinho);
        System.out.println();

        carrinho.vender(mouse2);

        System.out.println("Venda 2:");
        System.out.println(carrinho);
    }
}