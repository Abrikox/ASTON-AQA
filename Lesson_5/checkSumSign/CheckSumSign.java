package checkSumSign;

import java.util.Scanner;

public class CheckSumSign {

    public void checkSumSign(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите певое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b;

        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
}
