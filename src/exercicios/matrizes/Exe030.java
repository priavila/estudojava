package exercicios.matrizes;

import java.util.Scanner;

public class Exe030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matA = new int[M][N];
        int[][] matB = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                matA[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        
        sc.close();
    }
}
