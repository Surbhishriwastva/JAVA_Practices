import java.util.Scanner;

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        a = sc.nextInt();

        b = sc.nextInt();

    }
}

class B extends A {
    void add() {
        System.out.println("Addition=" + (a + b));
    }

}

class C extends A {
    void subtraction() {
        System.out.println("subtraction=" + (a - b));
    }

}

public class hieachical {
    public static void main(String[] args) {
        B bb = new B();
        bb.input();
        bb.add();
        C aa = new C();
        aa.input();
        aa.subtraction();

    }

}
