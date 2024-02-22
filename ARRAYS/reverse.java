package ARRAYS;

public class reverse {
    public static void get_reverse(int number[]) {
        int start = 0, end = number.length - 1;
        while (start < end) {

            int tem = number[start];
            number[start] = number[end];
            number[end] = tem;
            start++;
            end--;

        }

    }

    public static void main(String arg[]) {
        int number[] = { 1, 2, 3, 4, 5 };
        get_reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }

    }
}
