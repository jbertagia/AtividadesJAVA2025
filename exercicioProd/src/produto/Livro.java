package produto;

public class Livro extends Produtos{
    public String autor, genero;

    public Livro(String nome, double preco, String autor, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String Descrever() {
        return null;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n\n[Livro] \nNome: " + nome + 
        "\nAutor=" + autor + 
        "\nGenero=" + genero + 
        "\nPreco=" + preco + ".";
    }


}
