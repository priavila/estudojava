package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* double x;
        //x = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f%n", x);
        System.out.println("--------------------");

        // Entrada de dados em char
        char y;
        //y = sc.next().charAt(0);
        System.out.println("Voce digitou: " + y);
        System.out.println("--------------------"); */

        /* Entrada de dados na mesma linha (só digita dando espaço)
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); */

        // Quebra de linha pendente
        int x;
        String s1, s2, s3;
        x = sc.nextInt(); // assim vai dar erro
        // solução: acrescentar mais um nextLine extra antes
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
