package printColor;

import java.util.Random;

public class PrintColor {

    public void  printColor(){
        Random random = new Random();
        int value = random.nextInt(401) - 200;
        System.out.println("Число: " + value);

        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
