package ARRAYS.twodimesional;

public class quesj_1 {

    public static void counting(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (key == array[i][j]) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public static void main(String arg[]) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        counting(array, key);

    }

}
