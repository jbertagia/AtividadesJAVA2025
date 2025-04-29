package geometria;

public class Quadrado extends Formas {
    private String cor;

    public Quadrado(double base, double altura, String cor) {
        super(base, altura);
        this.cor = cor;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\n\n[Quadrado] \nBase: " + base + 
        "\nAltura: " + altura + 
        "\nÁrea do Quadrado: " + CalcularArea() + 
        "\nCor: " + cor + ".";
    }

    
}
