package function;

import java.util.*;

public class avg {
    public static int calavg(int a, int b, int c) {
        int avg = ((a + b + c) / 3);
        return (avg);
    }

    public static void main(String arg[]) {
        System.out.println();

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int averg = calavg(a, b, c);
        System.out.println(averg);
    }

}
