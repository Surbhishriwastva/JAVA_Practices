package Sorting;

public class counting {
    public static void countingsort(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            largest = Math.min(largest, number[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < number.length; i++) {
            count[number[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                number[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String args[]) {
        int number[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingsort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
