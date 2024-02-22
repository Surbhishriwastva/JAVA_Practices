import java.util.Scanner;

class Add {
    int a, b;

    Add() {
        a = 0;
        b = 0;
    }

    Add(int x, int y) {
        a = x;
        b = y;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void display() {
        System.out.println("a=" + a + "b=" + b);

    }

    void output() {
        int c;
        c = a + b;
        System.out.println("Addition=" + c);
    }

}

public class constructor {
    public static void main(String[] args) {
        Add aa = new Add(); // default constructor

        aa.display();
        aa.input();
        aa.output();
        Add cc = new Add(5, 10); // perimertized constructor
        cc.output();

    }

}
