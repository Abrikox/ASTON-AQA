package diagArray;

public class DiagArray {

    public void diagArr() {
        int a = 5;
        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++) {
            arr[i][i] = 1;
            arr[i][a - i - 1] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.printf("%4d", arr[i][j]);
            System.out.println();
        }



    }
}
