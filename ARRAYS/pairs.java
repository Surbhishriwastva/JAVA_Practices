package ARRAYS;

public class pairs {
    public static void get_pairs(int number[]) {
        int ts = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
                ts++;
            }

            System.out.println();

        }
        System.out.println(ts);
    }

    public static void main(String arg[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        get_pairs(number);

    }

}
