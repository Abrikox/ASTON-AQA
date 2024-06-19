package fillArray;

public class FillArray {

    public void arr(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
