package ARRAYS.twodimesional;

public class second_que {
    public static void secondrowsum(int array[][]) {
        int sum = 0;
        for (int j = 0; j < array[0].length; j++) {
            sum += array[1][j];

        }
        System.out.println(sum);
    }

    public static void main(String arg[]) {
        int array[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        secondrowsum(array);

    }
}
