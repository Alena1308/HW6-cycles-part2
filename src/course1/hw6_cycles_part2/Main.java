package course1.hw6_cycles_part2;

public class Main {
    public static void main(String[] args) {
        hw1Task1();
        hw1Task2();
        hw1Task3();
        hw2Task1();
        hw2Task2();
        hw2Task3();
        hw2Task4();
        hw3Task1();
        hw3Task2();
    }
    public static void hw1Task1() {
        System.out.println("ДЗ-1. Задание 1");
        double savings = 15_000;
        double total = 0;
        double percent = 0.01;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + savings;
            total = total + total * percent;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + (int)total + " рублей");
    }
    public static void hw1Task2() {
        System.out.println("ДЗ-1. Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void hw1Task3() {
        System.out.println("ДЗ-1. Задание 3");
        int populationY1 = 12_000_000;
        int year = 0;
        double birthRrateYear = 0.017;
        double mortalityYear = 0.008;
        double populationY2 = 12_000_000;
        while (year < 10) {
            year++;
            populationY2 = populationY2 + populationY2 * birthRrateYear - populationY2 * mortalityYear;
            System.out.println("Год " + year + ", численность населения составляет " + (int)populationY2);
        }
    }
   // Домашнее задание 2
    public static void hw2Task1() {
        System.out.println("ДЗ-2. Задание 1");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + salary;
            total = total + total * percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int)total + " рублей");
        }
    }
    public static void hw2Task2() {
        System.out.println("ДЗ-2. Задание 2");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + salary;
            total = total + total * percent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");
            }
        }
    }
    public static void hw2Task3() {
        System.out.println("ДЗ-2. Задание 3");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (i < 108) {
            i++;
            total = total + salary;
            total = total + total * percent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");
            }
        }
    }
    public static void hw2Task4() {
        System.out.println("ДЗ-2. Задание 4");
        int i = 2;
        System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
        for (; i < 31; i +=7) {
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            }
    }
    // Домашнее задание 3
    public static void hw3Task1() {
        System.out.println("ДЗ-3. Задание 1");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = 0; i <= ending; i +=79) {
            if (i >= beginning && i <= ending) {
                System.out.println(i);
            }
        }
    }
    public static void hw3Task2() {
        System.out.println("ДЗ-3. Задание 2");
        int i = 2;
        int b = 0;
        int c = 2;
        for (; c <= 20; c += 2) {
            if (b < 10) {
                b++;
            }
            System.out.println(i + "*" + b + "=" + c);
        }
    }
}
