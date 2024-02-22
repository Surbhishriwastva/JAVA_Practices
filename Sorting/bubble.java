package Sorting;

public class bubble {
    public static void bubbleshort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int number[] = { 5, 4, 1, 3, 2 };
        bubbleshort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
