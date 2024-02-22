package loop;

import java.util.*;

public class prime {
    public static void main(String[] arg) {
        System.out.println("enter the no");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (n % i == 0) {
                c++;
            }
            if (c == 2) {
                System.out.println("prime no");
            } else {
                System.out.println("not prime");
            }
        }
    }

}
