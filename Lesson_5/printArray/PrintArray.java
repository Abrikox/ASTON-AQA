package printArray;

public class PrintArray {

    public static void printArray() {
        int[] array = {1, 1, 1, 0, 1, 0, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" Исходный массив");

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
            System.out.print(array[i]);
        }
        System.out.println(" Новый массив");

    }
}
