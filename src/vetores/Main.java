package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando um vetor e instanciando
        int N = sc.nextInt();
        double[] v = new double[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextDouble();
        }

        // Acessar o vetor
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f%n", v[i]);
        }

        sc.close();
    }
}
