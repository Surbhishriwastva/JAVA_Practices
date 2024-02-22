package ARRAYS;

public class subarray_sum {
    public static void get_max(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum + " ");

                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("maxsum=" + maxsum);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        get_max(number);

    }

}
