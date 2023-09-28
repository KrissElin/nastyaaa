package lab3;

import java.util.Scanner;

//Создайте приложение, которое покажет, что для выражения a
//a^n+b^n=c^n
//(теорема Ферма) нет натуральных решений от 1 до 100 и n>2. Убедитесь, что есть решения
//для n=2, и выведите их в консоль.
public class Zadanie1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100: ");
        int n = sc.nextInt();

        if(n > 0 && n < 100) { //Проверяем на условие n
            if(n>2) {
                System.err.println("Решений нет");
            }
            for (int i=1; i<=100;i++) {     //цикл for для того чтобы пройти через все значения от 1 до 100
                for (int j = 1; j <= 100; j++) { //выше
                    for (int k = 1; k <= 100; k++) { //выше
                        double a = Math.pow(i, n); // Записываем каждое число в степени
                        double b = Math.pow(j, n); //выше
                        double c = Math.pow(k, n); //выше
                        if (a + b == c) {       //если условие выполняется то
                            System.out.println(i + " ^ " + n + " + " + j + " ^ " + n + " = " + k + " ^ " + n);
                        }
                    }
                }
            }
        } else{
                System.err.println("Решений нет");
                return;
            }
        }
    }

