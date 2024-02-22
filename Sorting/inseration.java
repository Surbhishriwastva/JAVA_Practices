package Sorting;

public class inseration {
    public static void inserationsort(int number[]){
        for(int i=0;i<number.length;i++)
        {
            int curr =number[i];
            int j=i-1;
            while(j>=0 && number[j]>curr){
                number[j+1]=number[j];
                j--;
            }
            number[j+1]=curr;
        }
    }

    public static void main(String args[]) {
        int number[] = { 5, 4, 1, 3, 2 };
        inserationsort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
