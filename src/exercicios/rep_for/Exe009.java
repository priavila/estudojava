package exercicios.rep_for;

import java.util.Scanner;

public class Exe009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(i + " x " + n + " = " + result);
        }

        sc.close();
    }
}

