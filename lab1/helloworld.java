package lab1;

import java.util.Scanner;

public class helloworld {
    public helloworld() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания:");
        int numberZadanie = scanner.nextInt();
        switch (numberZadanie) {
            case 1:
                System.out.println(sum(1.0, 2.0));
                break;
            case 2:
                System.out.println(sum2(3, 2));
        }

    }

    public static double sum(double ch1, double ch2) {
        return ch1 + ch2;
    }

    public static int sum2(int ch1, int ch2) {
        return ch1 + ch2;
    }
}
