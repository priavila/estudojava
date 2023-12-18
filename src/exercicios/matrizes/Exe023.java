package exercicios.matrizes;

import java.util.Scanner;

public class Exe023 {
    public static void main(String[] args) {

        // Exercicio de matriz

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Saída da matriz
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
