package function;

import java.util.Scanner;

public class prime {
    public static boolean check_prime(int n) {
        if (n == 2) {
            return true;

        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void print_primeno(int n) {
        for (int i = 2; i <= n; i++) {
            if (check_prime(i)) {
                System.out.print(i + ' ');
            }
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check_prime(n));
        print_primeno(20);
    }

}
