package function;

public class coff {
    public static int factorail(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }

    public static void r(int r) {
        factorail(r);

    }

    public static void n_r(int p) {
        factorail((p));

    }

    public static void main(String arg[]) {
        // int n = 5;
        int f = factorail(5);
        r = (2);

    }
}
