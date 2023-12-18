import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int totalR = 0, totalS = 0, totalC = 0, totalQ;
        double percRato, percSapo, percCoelho;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);
            if (tipo == 'R') {
                totalR += quantia;
            }
            else if (tipo == 'S') {
                totalS += quantia;
            }
            else {
                totalC += quantia;
            }
        }
        totalQ = totalR + totalS + totalC;
        percRato = (totalR * 100.0) / totalQ;
        percSapo = (totalS * 100.0) / totalQ;
        percCoelho = (totalC * 100.0) / totalQ;

        System.out.println("Total: " + totalQ + " cobaias");
        System.out.println("Total de coelhos: " + totalC);
        System.out.println("Total de ratos: " + totalR);
        System.out.println("Total de sapos: " + totalS);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percSapo);

        sc.close();
    }
}
