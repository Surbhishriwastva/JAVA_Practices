package ARRAYS;

public class subarray {
    public static void get_subarray(int array[]) {
        int ts = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(array[k] + " ");
                }

                ts++;
                System.out.println();
            }

            System.out.println();

        }

        System.out.println(ts);

    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        get_subarray(array);

    }

}
