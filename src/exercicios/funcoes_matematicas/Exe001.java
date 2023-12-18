package exercicios.funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exe001 {
    public static void main(String[] args) {
        // Funções matemáticas

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double precoTerreno = metroQuadrado * area;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", precoTerreno);

        sc.close();
    }
}
