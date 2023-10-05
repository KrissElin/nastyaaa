package lab4;
import java.util.Scanner;
public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        int n = (int) (Math.random()*9); // z = случайному числу
        switch (n) { //сравниваем введенное значение со списком значений
            case 0 -> System.out.println("Ноль"); //если введенное число равно 0, то выводим Ноль и тд
            case 1 -> System.out.println("Один");
            case 2 -> System.out.println("Два");
            case 3 -> System.out.println("Три");
            case 4 -> System.out.println("Четыре");
            case 5 -> System.out.println("Пять");
            case 6 -> System.out.println("Шесть");
            case 7 -> System.out.println("Семь");
            case 8 -> System.out.println("Восемь");
            case 9 -> System.out.println("Девять");
            default -> System.out.println("Ошибка. Введите число от 1 до 9");
        }
    }
}
