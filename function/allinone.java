package function;

import java.util.*;

public class allinone {
    public static void table() {
        System.out.println("enter the no to print table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int tab = n * i;

            System.out.println(tab);
        }

    }

    public static void factorail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no to find the factorail");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        System.out.println(fact);
    }

    // ********************************************************************************
    public static void factor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to find the factor");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }

    public static void factorsum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to find the sum of factor");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s + i;
            }

        }
        System.out.println(s);

    }

    // ************************************************************************************
    public static void prime() {
        // prime are those no who divisible by 1 ans ownself
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to find the sum of factor");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime no ");
        } else {
            System.out.println("not prime");
        }

    }

    // **************************************************** */
    public static void perefect() {
        // are those whose equal to sum of factor
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to find the sum of factor");
        int n = sc.nextInt();

        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if (s == n) {
            System.out.println("perfect  no");
        } else {
            System.out.println("not perfect  no");
        }

    }

    // *********************************************************** */
    public static void amicable() {
        System.out.println("enter two no ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int as = 0, bs = 0;
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                as = as + i;
            }
        }
        for (int i = 0; i < b; i++) {
            if (b % i == 0) {
                bs = bs + i;
            }
        }
        if (as == b && bs == a) {
            System.out.println("amicable no");
        } else {
            System.out.println("not amicable no");
        }
    }

    public static void main(String arg[]) {
        // table();
        // factorail();
        // factor();
        // factorsum();
        // prime()
        // prime();
        perefect();

    }

}
