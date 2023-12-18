package exercicios.matrizes;

import java.util.Scanner;

public class Exe029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc. nextInt();
        int[][] mat = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) { // CORRETA
                // (MINHA LÓGICA) if (i == 0 && j == 1 || i == 0 && j == 2 || i == 1 && j == 2) {
                    soma += mat[i][j];
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
