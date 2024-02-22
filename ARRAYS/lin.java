package ARRAYS;

public class lin {
    public static void linea(int number[]) {
        int ts = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = j; k < number.length; k++) {
                    System.out.print("(" + number[i] + "," + number[j] + "," + number[k] + ")");
                }
                System.out.println();
                System.out.print("(" + number[i] + "," + number[j] + ")");

            }
            System.out.println();
            System.out.print(number[i]);

            System.out.println();

        }
        System.out.println(ts);
    }

    public static void main(String args[]) {
        // int key = 9;
        int number[] = { 2, 4, 6, 8, 10 };
        linea(number);
    }

}
