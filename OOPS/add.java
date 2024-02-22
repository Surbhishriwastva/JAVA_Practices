import java.util.Scanner;

class sum {
    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        a = sc.nextInt();
        System.out.println("enter second no");
        b = sc.nextInt();
    }

    void show() {
        System.out.println("Addition=" + (a + b));
    }

    public class add {
        public void main(String[] args) {
            sum aa = new sum();
            aa.getdata();
            aa.show();
        }

    }
}
