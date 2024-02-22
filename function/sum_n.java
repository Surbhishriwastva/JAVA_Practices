package function;

import java.util.*;

public class sum_n {
    public static int calsum(int s) {
        int sum = 0;
        while (s > 0)
            sum = sum + s % 10;
        return sum;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(calsum(s));
    }

}
