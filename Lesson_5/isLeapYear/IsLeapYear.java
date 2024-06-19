package isLeapYear;

import java.util.Scanner;

public class IsLeapYear {
    private int year;
    private final boolean isLeap = isLeapYear();
    public boolean isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        this.year = scanner.nextInt();
        if (this.year % 400 == 0) {
            return true;
        } else if (this.year % 100 == 0) {
            return false;
        } else if (this.year % 4 == 0) {
            return true;
        } else return false;
    }
    public void value() {
        if (isLeap) {
            System.out.println(year + " год - Високосный");
        } else System.out.println(year + " год - Невисокосный");
    }
}
