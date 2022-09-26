import java.time.Year;

public class main {
    public static void main(String[] args) {

        // задание 1
        checkLeapYear(1988);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + "  не високосный год");
        }
    }
}








