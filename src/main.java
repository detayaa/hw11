import javax.swing.*;
import java.time.Year;

public class main {
    public static void main(String[] args) {

        // задание 1
        checkLeapYear(1988);

        // задание 2
        checkPhone(1, 2022);

        // задание 3
        int deliveryDays = deliveryDistance(95);
        System.out.println("Потребуется дней " + deliveryDays);
    }

    private static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + "  не високосный год");
        }
    }


    private static void checkPhone(int typeOS, int clientDeviceYear) {
        if (typeOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS");
            } else {
                System.out.println("У вас IOS");
            }
        } else if (typeOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Устновите облегченную версию для Android");
            } else {
                System.out.println("У вас Android");
            }
        } else if (typeOS != 0 && typeOS != 1) {
            System.out.println("Ошибка определения ОС");
        }
    }

    private static int deliveryDistance(int distance) {
        int days = 1;
        if (distance >= 20 && distance < 60) {
            days += 1;
        }
        if (distance >= 60 && distance < 100) {
            days += 2;
        } return days;
    }
}












