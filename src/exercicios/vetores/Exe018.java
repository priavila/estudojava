package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe018 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        double soma=0.0;
        int cont=0;
        for (int v: vet) {
            if (v%2==0) {
                soma += v;
                cont++;
            }
        }

        // não esquecer de sempre colocar informações se o resultado não existir
        if (cont == 0) {
            System.out.println("Nenhum número é par");
        }

        double media = soma/cont;
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
