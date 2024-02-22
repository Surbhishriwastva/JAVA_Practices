import java.util.Scanner;

class A {
    int a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first no");
        a = sc.nextInt();
    }
}

class B extends A {
    int b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        b = sc.nextInt();
    }
}

class C extends B {
    void add() {
        System.out.println("Addition=" + (a + b));
    }

    void display() {
        System.out.println("a=" + a + "\nb=" + b);
    }
}

public class multilevel_inhe {
    public static void main(String[] args) {
        C cc = new C();
        cc.input();
        cc.getdata();
        cc.display();
        cc.add();
    }

}
