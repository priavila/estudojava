package exercicios.vetores;

import java.util.Scanner;

public class Exe019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];

        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
        }

        int maior = idades[0];
        int posicao = 0;
        for (int i=0; i<N; i++) {
            if (idades[i] > maior) {
               maior = idades[i];
               posicao = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s%n", nomes[posicao]);

        sc.close();
    }
}
