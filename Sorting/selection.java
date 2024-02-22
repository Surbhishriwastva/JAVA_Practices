package Sorting;

public class selection {
    public static void selection(int number[]) {
        
        for (int i = 0; i < number.length; i++) {
            int smaller = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[smaller] > number[j]) {
                    smaller = j;
                }

            }
            // swap
            int temp = number[smaller];
            number[smaller] = number[i];
            number[i] = temp;

        }
    }

    public static void main(String args[]) {
        int number[] = { 5, 4, 1, 3, 2 };
        selection(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
