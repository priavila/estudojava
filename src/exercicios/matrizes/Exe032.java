package exercicios.matrizes;

import java.util.Scanner;

public class Exe032 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] filaSoldados = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                filaSoldados[i][j] = sc.nextInt();
            }
        }

        int girarFila = sc.nextInt();
        girarFila = girarFila - 1;

        int ultimoDaFila = filaSoldados[girarFila][N-1];

        for (int j=N-1; j>0; j--) {
            filaSoldados[girarFila][j] = filaSoldados[girarFila][j-1];
        }

        filaSoldados[girarFila][0] = ultimoDaFila;

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(filaSoldados[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
