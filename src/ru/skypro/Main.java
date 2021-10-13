package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0;      // 0 -> iOS; 1 -> Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        int clientOS = 1;     // 0 -> iOS; 1 -> Android
        int clientDeviceYear = 2020;    // <2015 -> облегчённая версия
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static void task3(){
        int year = 2025;
        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 >= 0) {
                System.out.println(year + " год является високосным.");
        }
    }

    public static void task4(){
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1.");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: 2.");
            } else {
                System.out.println("Потребуется дней: 3.");
            }
        }
    }


    private static void task5(){
        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("There are 12 months only.");
        }
    }

    private static void task6(){
        int age = 19;
        int salary = 58_000;
        int salaryInTwoTimes = salary * 2;           //            age<23 + salary < 50_000
        int salaryInThreeTimes = salary * 3;         //            age>=23 + salary < 50_000
        double salaryLimitUpCase1 = salary * 2.4;   // 2*1.2=2.4; age<23 + salary >= 50_000
        double salaryLimitUpCase2 = salary * 3.6;   // 3*1.2=3.6; age>=23 + salary >= 50_000
        int salaryLimitUpCase3 = salary * 3;       // 2*1.5=3;   age<23 + salary >= 80_000
        double salaryLimitUpCase4 = salary * 4.5;  // 3*1.5=4.5; age>=23 + salary >= 80_000
        if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryInTwoTimes + " рублей.");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryLimitUpCase3 + " рублей.");
        } else if (age < 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryLimitUpCase1 + " рублей.");
        } else if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryInThreeTimes + " рублей.");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryLimitUpCase4 + " рублей.");
        } else if (age >= 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryLimitUpCase2 + " рублей.");
        }
    }

    private static void task7(){
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        int creditTerm = 12;

        double lendingRateCase1 = 1.11;           // lending rate = 11% + age<23 + salary<80_000
        double lendingRateCase2 = 1.03;           // lending rate = 10.3% + age<23 + salary>=80_000
        double lendingRateCase3 = 1.05;           // lending rate = 10.5% + 23<age<30 + salary<80_000
        double lendingRateCase4 = 0.98;           // lending rate = 9.8% + 23<age<30 + salary>=80_000
        double lendingRateCase5 = 1.1;            // lending rate = 10% + age>30 + salary<80_000
        double lendingRateCase6 = 0.93;           // lending rate = 9.3% + age>30 + salary>=80_000

        double case1 = (wantedSum * lendingRateCase1)/creditTerm; // lending rate = 11% + age<23 + salary<80_000
        double case2 = (wantedSum * lendingRateCase2)/creditTerm; // lending rate = 10.3% + age<23 + salary>=80_000
        double case3 = (wantedSum * lendingRateCase3)/creditTerm; // lending rate = 10.5% + 23<age<30 + salary<80_000
        double case4 = (wantedSum * lendingRateCase4)/creditTerm; // lending rate = 9.8% + 23<age<30 + salary>=80_000
        double case5 = (wantedSum * lendingRateCase5)/creditTerm; // lending rate = 10% + age>=30 + salary<80_000
        double case6 = (wantedSum * lendingRateCase6)/creditTerm; // lending rate = 9.3% + age>=30 + salary>=80_000


        if (age < 23 && salary < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case1 + " рублей.");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case2 + " рублей.");
        } else if (age > 23 && age < 30 && salary < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case3 + " рублей.");
        } else if (age > 23 && age < 30 && salary >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case4 + " рублей.");
        } else if (age >= 30 && salary < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case5 + " рублей.");
        } else if (age >= 30 && salary >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + case6 + " рублей.");
        }
    }
}