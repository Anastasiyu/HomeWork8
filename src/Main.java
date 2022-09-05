import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        leapYear(2020);
    }
    public static void leapYear (int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
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
        public static void task2() {
            int clientOS = 0;
            int clientDeviceYear = LocalDate.now().getYear();
            desiredLink(clientOS, clientDeviceYear);
        }
    public static int distans(){
        return 56;
    }
    public static void task3() {


        int deliveryDistance = distans();
        int deliveriDays = 1;
        if (deliveryDistance > 20) {
            deliveriDays++;
        }
        if (deliveryDistance > 60) {
            deliveriDays++;
        }
        {
            System.out.print("Потребуеться дней: ");
            sumDeliveriDay (deliveriDays);
        }

    }


    public static void sumDeliveriDay(int deliveriDays) {
        System.out.println(deliveriDays);
    }
}
