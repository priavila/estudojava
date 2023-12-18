package exercicios.rep_while;

import java.util.Locale;
import java.util.Scanner;

public class Exe008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cc = 0;

        /* UMA FORMA DE FAZER
        if (idade < 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            while (idade >= 0) {
               soma = soma + idade;
               cc++;
               idade = sc.nextInt();
            }
            System.out.printf("%.2f%n", soma / cc);
        } */

        // SEGUNDA FORMA
        while (idade >= 0) {
            soma = soma + idade;
            cc++;
            idade = sc.nextInt();
        }
        if (cc > 0) {
            double media = (double) soma / cc;
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("Impossivel calcular");
        }

        sc.close();
    }
}
