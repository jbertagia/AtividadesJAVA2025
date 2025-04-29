import java.util.Scanner;

import geometria.*;


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, altura, circunferencia;
        
        System.out.println("Exercicio 4");

        System.out.println("\nInforme uma base: ");
        base = in.nextDouble();
        System.out.println("\nInforme uma altura: ");
        altura = in.nextDouble();
        System.out.println("\nInforme uma circunferência: ");
        circunferencia = in.nextDouble();

        Quadrado quadrado = new Quadrado(base, altura, "Preto");
        
        Triangulo triangulo = new Triangulo(base, altura, "Isósceles");

        Circulo circulo = new Circulo(circunferencia);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
    }
}
