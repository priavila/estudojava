package operadores_atribuicao_cumulativa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double plano = 50.0;
        if (minutos > 100) {
            // atribuição cumulativa (+=; -=; /=; *=; %=)
            plano += (minutos - 100) * 2.0; // mesma coisa que: plano = plano + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar R$ %.2f%n", plano);

        sc.close();
    }
}
