package isNegative;

import java.util.Random;

public class IsNegative {

    Random random = new Random();
    private final int a;

    public IsNegative() {
        this.a = random.nextInt(20) - 10;
    }
    public boolean isNegative(int a){
        return a < 0;

    }

    public int getA() {
        return a;
    }
}
