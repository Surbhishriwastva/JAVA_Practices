package function;

import java.util.*;;

public class mult {
    public static int cal_mult(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String arg[]) {
        // int a = 10;
        // int b = 3;
        System.out.print("enter two no");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int product = cal_mult(a, b);
        System.out.println(product);

    }

}
