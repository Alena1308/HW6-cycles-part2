package course1.hw6_cycles_part2;

public class Main {
    public static void main(String[] args) {
        runHomeWork1Task1();
        runHomeWork1Task2();
        runHomeWork1Task3();
        runHomeWork2Task1();
        runHomeWork2Task2();
        runHomeWork2Task3();
        runHomeWork2Task4();
        runHomeWork3Task1();
        runHomeWork3Task2();
    }
    public static void runHomeWork1Task1() {
        System.out.println("ДЗ-1. Задание 1");
        double savings = 15_000;
        double total = 0;
        double percent = 0.01;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total += savings;
            total += total * percent;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", i, total);
        System.out.println();
    }
    public static void runHomeWork1Task2() {
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
    public static void runHomeWork1Task3() {
        System.out.println("ДЗ-1. Задание 3");
        int year = 0;
        double birthRateYear = 0.017;
        double mortalityYear = 0.008;
        double population = 12_000_000;
        while (year < 10) {
            year++;
            population += population * (birthRateYear - mortalityYear);
            System.out.println("Год " + year + ", численность населения составляет " + (int)population);
        }
    }
   // Домашнее задание 2
    public static void runHomeWork2Task1() {
        System.out.println("ДЗ-2. Задание 1");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total += salary;
            total += total * percent;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", i, total);
            System.out.println();
        }
    }
    public static void runHomeWork2Task2() {
        System.out.println("ДЗ-2. Задание 2");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total += salary;
            total += total * percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", i, total);
                System.out.println();
            }
        }
    }
    public static void runHomeWork2Task3() {
        System.out.println("ДЗ-2. Задание 3");
        double salary = 15_000;
        double total = 0;
        double percent = 0.07;
        int i = 0;
        while (i < 108) {
            i++;
            total += salary;
            total += total * percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", i, total);
                System.out.println();
            }
        }
    }
    public static void runHomeWork2Task4() {
        System.out.println("ДЗ-2. Задание 4");
        for (int i = 2; i <= 31; i +=7) {
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            }
    }
    // Домашнее задание 3
    public static void runHomeWork3Task1() {
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
    public static void runHomeWork3Task2() {
        System.out.println("ДЗ-3. Задание 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}
