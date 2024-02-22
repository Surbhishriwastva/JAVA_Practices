package function;

public class swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        // here a=10,b=5

    }

    public static void main(String arg[]) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}