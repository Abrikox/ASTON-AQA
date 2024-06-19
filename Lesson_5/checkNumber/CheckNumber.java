package checkNumber;

import java.util.Random;

public class CheckNumber {
    Random random = new Random();
    private final int a;

    public CheckNumber() {
        this.a = random.nextInt(20) - 10;
    }

    public void checkNumber(int a){
        if (a >= 0){
            System.out.println(a + " - Положительное число");
        }else System.out.println(a + " - Отрицательное число");

    }

    public int getA() {
        return a;
    }

}
