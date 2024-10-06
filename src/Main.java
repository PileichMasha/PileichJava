import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /**1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
     - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
     "a > b", "a < b" или "a = b";
     - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.**/

    private static void task1() {
        System.out.println("Задача №1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        double res = a + b;
        System.out.println("a + b = " + res);
        res = a - b;
        System.out.println("a - b = " + res);
        res = a * b;
        System.out.println("a * b = " + res);
        res = (a / b) + (double) (a % b) / b;
        System.out.println("a / b = " + String.format("%.2f",res));
    }

    /**2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
      В результате сравнения в консоль должно быть выведено одно из сообщений:
     "Строки неидентичны" или "Строки идентичны"**/

    private static void task2() {
        System.out.println("Задача №2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите две строки");
        System.out.print("a = ");
        String a = sc.nextLine();
        System.out.print("b = ");
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    /**3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10].
    Необходимо написать программу, которая выведет в консоль все чётные числа.**/

    private static void task3() {
        System.out.println("Задача №3");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}