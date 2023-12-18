package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe022 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomeMercadoria = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];

        for (int i=0; i<N; i++) {
            nomeMercadoria[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }

        int lucroMenor = 0, lucroMedio = 0, lucroMaior = 0;
        for (int i=0; i<N; i++) {
            double lucro = (precoVenda[i] - precoCompra[i]) * 100.0 / precoCompra[i];
            if (lucro < 10.0) {
                lucroMenor++;
            } else if (lucro >= 10.0 && lucro <= 20.0) {
                lucroMedio++;
            } else {
                lucroMaior++;
            }
        }
        System.out.println("Lucro abaixo de 10%: " + lucroMenor);
        System.out.println("Lucro entre 10% e 20%: " + lucroMedio);
        System.out.println("Lucro acima de 20%: " + lucroMaior);

        double somaCompra = 0, somaVenda = 0;
        for (int i=0; i<N; i++) {
            somaCompra += precoCompra[i];
            somaVenda += precoVenda[i];
        }
        System.out.printf("Valor total de compra: %.2f%n", somaCompra);
        System.out.printf("Valor total de venda: %.2f%n", somaVenda);

        double lucroTotal = somaVenda - somaCompra;
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        sc.close();
    }
}
