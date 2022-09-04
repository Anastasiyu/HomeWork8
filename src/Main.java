import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        leapYear(2021);
    }
    public static void leapYear (int year) {

        if (year % 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }}
