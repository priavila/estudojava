package exercicios.vetores;

import java.util.Scanner;

public class Exe015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] pares = new int[N];

        for (int i=0; i<N; i++) {
            pares[i] = sc.nextInt();
        }

        int cont = 0;
        for (int i=0; i<N; i++) {
            if (pares[i] % 2 == 0) {
                System.out.print(pares[i] + " ");
                cont++;
            }
        }
        System.out.println();
        System.out.println(cont);

        sc.close();
    }
}
