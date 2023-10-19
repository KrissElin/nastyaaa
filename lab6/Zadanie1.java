package lab6;
import java.util.Scanner;
//Напишите программу, которая моделирует работу банкомата по
// выдаче введенной суммы денег наименьшим количеством рублевых купюр.
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для выдачи: ");
        int amount = scanner.nextInt();
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 10}; //массив denominations для хранения номиналов купюр
        int[] count = new int[denominations.length]; //массив count для хранения количества каждой купюры, которое необходимо выдать.

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        System.out.println("Выдано купюр:");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " рублей: " + count[i] + " штук");
            }
        }
        if (amount > 0) {
            System.out.println("Сумму невозможно выдать полностью!");
        }
    }
}
