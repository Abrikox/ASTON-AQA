package printString;

import java.util.Scanner;

public class PrintString {

    Scanner scanner = new Scanner(System.in);
    private String str;
    private int a;

    public PrintString() {
        System.out.print("Введите строку: ");
        this.str = scanner.nextLine();
        System.out.print("Введите число: ");
        this.a = scanner.nextInt();
    }

    public void printString(String str, int a){
        for (int i = 0; i <= a-1; i++){
            System.out.println(str);
        }
    }

    public String getStr() {
        return str;
    }

    public int getA() {
        return a;
    }
}
