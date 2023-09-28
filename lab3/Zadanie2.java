package lab3;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введи m: ");
        int m = scanner.nextInt();      //Записываем введеное число в m
        double res = 0, n = 1;
        for (int i=1; i<= m; i++) { // цикл for для того чтобы пройти через все значения от 1 до m
            if (i%2 == 0) {         // если остаток от деления на 2 равен 0
                res -= n/i;         // от результата отнять n/i
            }
            else {
                res += n/i;         // иначе прибавить n/i
            }

        }
        System.out.print("Результат: " +res);
    }
}

