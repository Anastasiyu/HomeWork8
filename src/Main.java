import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        leapYear(2021);
    }
    public static void leapYear (int year) {

        if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        desiredLink(clientOS, clientDeviceYear); }
        public static void desiredLink (int clientOS, int clientDeviceYear) {

        if (clientOS == 0) {

            if (clientDeviceYear < 2015) {

                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }
}


