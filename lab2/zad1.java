package lab2;

import java.util.Scanner;

public class zad1 {
    public zad1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n:");
        double n = scanner.nextDouble();
        //int i = false;
        double rez = 2.0;
        int i;
        if (n < 0.0) {
            for(i = -1; (double)i > n; --i) {
                rez *= 2.0;
                System.out.println("2 ^ " + (i - 1) + " = " + 1.0 / rez);
            }
        } else {
            for(i = 1; (double)i < n; ++i) {
                rez *= 2.0;
                System.out.println("2 ^ " + (i + 1) + " = " + rez);
            }
        }

    }
}
