package lab5;
import java.util.Random;
//Дан массив из целых чисел A(n), где n=1,25.
//Необходимо поменять местами его максимальный и минимальный элемент.
public class Zadanie1 {
    public static void main(String args[]) {
        int[] A = new int[25];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imax = 0, imin = 0, swap;
        Random random = new Random();
        //заполняем массив и выводим и определяем индексы максимума и минимума
        System.out.println("Исходный массив:");
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt() % 100;
            System.out.print(A[i] + " ");
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }
        //Меняем местами и выводим
        System.out.println("максимальное число A[" + (imax + 1) + "] = " + A[imax]);
        System.out.println("минимальное число A[" + (imin + 1) + "] = " + A[imin]);
        swap = A[imin];
        A[imin] = A[imax];
        A[imax] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < A.length; i++) System.out.print(A[i] + " ");
    }
}
