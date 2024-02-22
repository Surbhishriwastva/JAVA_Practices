package function;

public class iseven {
    public static boolean check_even(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String arg[]) {
        int n = 4;
        System.out.println(check_even(n));
        if (check_even(n)) {
            System.out.println("even no");
        } else {
            System.out.println("not even");
        }

    }

}
