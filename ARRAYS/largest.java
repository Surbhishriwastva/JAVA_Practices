package ARRAYS;

public class largest {
    public static int get_largest(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

        }
        return largest;
    }

    public static int get_smallest(int number[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }

        }
        return smallest;
    }

    public static void main(String arg[]) {
        int number[] = { 4, 5, 2, 17, 9 };
        System.out.println(get_largest(number));
        System.out.println(get_smallest(number));
    }

}
