package lab5;

import java.util.Random;

public class Zad1 {
    public static void main(String args[]) {
        int[] array = new int[25]; //заводим массив
        int max = 0;
        int min = 0;
        int minIndex = 0, swap;
        int maxIndex = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 10;//определяем индексы мин и макс и находим элементы
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(array.length);
        swap = array[minIndex]; //меняем мин и макс местами и выводим
        array[minIndex] = array[maxIndex];
        array[maxIndex] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");

    }
}
