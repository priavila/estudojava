package vetores.for_each;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
        }
        System.out.println("Nomes lidos:");

        // For Each
        for (String s: nomes) {
            System.out.println(s);
        }

        sc.close();
    }
}
