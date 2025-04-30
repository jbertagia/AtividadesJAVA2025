package venda;

import java.util.List;

import produto.Produtos;

public class Carrinho {
    public List<Produtos> produtos;
    public double total;

    public Carrinho(List<Produtos> produtos, double total) {
        this.produtos = produtos;
        this.total = total;
    }

    private void calcularVenda() {
        total = 0.0;
        for (Produtos p : produtos) {
            total += p.getPreco();
        }
    }

    public void vender(List<Produtos> listaDeProdutos) {
        this.produtos.addAll(listaDeProdutos);
        calcularVenda();
    }

    public void vender(Produtos produto) {
        this.produtos.add(produto);
        this.total += produto.getPreco();
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "\n\n[Carrinho] \nProdutos: " + produtos + 
        "\nTotal: " + total + ".";
    }
    
}
