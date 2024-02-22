package ARRAYS;

public class FIRSt {
    public static void update(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }

    }

    public static void main(String arg[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        update(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
