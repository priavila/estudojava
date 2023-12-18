package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia ");
        int diaInicial = sc.nextInt();
        //sc.next();
        int hraInicial = sc.nextInt();
        String z = sc.next();
        int minInicial = sc.nextInt();
        z = sc.next();
        int segInicial = sc.nextInt();
        System.out.print("Dia ");
        int diaFinal = sc.nextInt();
        int hraFinal = sc.nextInt();
        z = sc.next();
        int minFinal = sc.nextInt();
        z = sc.next();
        int segFinal = sc.nextInt();

        int totalHrsDias = (diaFinal - diaInicial) * 24; // 96 horas



        sc.close();
    }
}
