package transArray;

public class TransArray {

    public void transArr(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" Исходный массив");

        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println(" Новый массив");
    }
}
