package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i=0; i<N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double maiorAltura = altura[0];
        double menorAltura = altura[0];

        for (int i=0; i<N; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        for (int i=0; i<N; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        int qtdMulheres = 0;
        double soma = 0, media = 0;
        for (int i=0; i<N; i++) {
            if (sexo[i] == 'F') {
                soma = soma + altura[i];
                qtdMulheres++;
                media = soma / qtdMulheres;
            }
        }

        if (qtdMulheres == 0) {
            System.out.println("Não há mulheres dentre as pessoas.");
        } else {
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }

        int qtdHomens = 0;
        for (int i=0; i<N; i++) {
            if (sexo[i] == 'M') {
                qtdHomens++;
            }
        }
        System.out.printf("Numero de homens = %d%n", qtdHomens);

        sc.close();
    }
}
