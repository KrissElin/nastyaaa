package lab5;

import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        Random random = new Random();

// Заполняем таблицу случайными элементами от 0 до 10
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(11); // Генерируем случайное число от 0 до 10
            }
        }

// Выводим таблицу на консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
