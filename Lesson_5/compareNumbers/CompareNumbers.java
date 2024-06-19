package compareNumbers;

import java.util.Random;

public class CompareNumbers {

    public void compareNumbers(){
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
