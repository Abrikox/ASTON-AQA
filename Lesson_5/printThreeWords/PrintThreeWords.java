package printThreeWords;

import java.util.Arrays;

public class PrintThreeWords {

    public void words(){
        String[] word = {"Orange", "Banana", "Apple"};
        Arrays.stream(word).forEach(System.out::println);
    }


}
