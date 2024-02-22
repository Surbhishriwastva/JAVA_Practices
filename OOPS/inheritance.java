import java.util.Scanner;

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        a = sc.nextInt();

        b = sc.nextInt();

    }

    void add() {
        System.out.println("Addition=" + (a + b));
    }
}

class B extends A {
    int c;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        c = sc.nextInt();

    }

    void display() {
        System.out.println("Addition=" + (a + b + c));
    }
}

public class inheritance {
    public static void main(String[] args) {
        B aa = new B();
        aa.input();
        aa.add();
        aa.getdata();

        aa.display();
    }

}
