package loop;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // sum of natural no

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}
