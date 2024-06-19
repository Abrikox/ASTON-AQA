package isSumInRange;

import java.util.Random;

public class IsSumInRange {
     private int a;
     private int b;

    public boolean isSumInRange(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum >=10 && sum <= 20;
    }

}
