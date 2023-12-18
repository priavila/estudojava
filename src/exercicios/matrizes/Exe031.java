package exercicios.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exe031 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] mat = new double[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        // Soma dos elementos positivos da matriz
        double soma = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] > 0) {
                    soma = soma + mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

        // Leitura do índice de uma linha da matriz
        int linha = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(mat[linha][j] + " ");
            }
        }
        System.out.println();

        // Leitura do índice de uma coluna da matriz
        int coluna = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i=0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][coluna] + " ");
            }
        }
        System.out.println();

        // Diagonal principal
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i=0; i<N; i++) {
            System.out.print(mat[i][i] + " ");
        }

        // Alterar matriz
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }
        System.out.println();

        // Mostrar matriz alterada
        System.out.println("MATRIZ ALTERADA:");

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
