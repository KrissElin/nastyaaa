package lab6;
import java.util.Scanner;
public class Zadanie2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Ввод процентной ставки
            System.out.print("Введите годовую процентную ставку (в процентах): ");
            double stavka = scanner.nextDouble();
            // Ввод суммы кредита
            System.out.print("Введите сумму кредита: ");
            double summa = scanner.nextDouble();
            // Ввод срока кредита в годах
            System.out.print("Введите срок кредита (в годах): ");
            int years = scanner.nextInt();
            // Преобразование процентной ставки в месячную ставку
            double messtavka = stavka / 12 / 100;
            // Преобразование срока кредита в месяцы
            int months = years * 12;
            // Вычисление ежемесячного платежа
            double plat = (summa * messtavka) / (1 - Math.pow(1 + messtavka, -months));
            // Вычисление стоимости кредита
            double stoimkred = plat * months;
            System.out.println("Ежемесячный платеж: " + plat);
            System.out.println("Стоимость кредита: " + stoimkred);
        }
    }

