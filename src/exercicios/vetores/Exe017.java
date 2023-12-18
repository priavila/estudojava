package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        double soma=0;
        for (double s: vet) {
            soma += s;
        }

        double media = soma / N;
        System.out.printf("%.3f%n", media);

        for (double n: vet) {
            if (n < media) {
                System.out.printf("%.1f%n", n);
            }
        }

        sc.close();
    }
}
