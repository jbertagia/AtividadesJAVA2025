package produto;

public class Mouse extends Produtos{
    public String tipo, descricao;

    public Mouse(String nome, double preco, String tipo, String descricao) {
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @Override
    public String Descrever() {
        return null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n\n[Mouse] \nNome: " + nome +
        "\nTipo: " + tipo + 
        "\nDescricao: " + descricao + 
        "\nPreco: " + preco + ".";
    }  

}
