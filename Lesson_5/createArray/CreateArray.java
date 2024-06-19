package createArray;

public class CreateArray {

    public static int[] createArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
//    public void printArr(int[] arr){
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }

}
