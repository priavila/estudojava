package exercicios.if_elseif;

import java.util.Locale;
import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r1, r2;

        double delta = Math.pow(b,2) - 4.0 * a * c;

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        sc.close();
    }
}