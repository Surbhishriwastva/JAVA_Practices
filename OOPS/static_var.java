
class stat {
    int rollno;
    String name;
    static String clgname = " cimage";

    stat(int x, String y) {
        rollno = x;
        name = y;
    }

    void display() {
        System.out.println("Rollno=" + rollno + "Name=" + name + "college =" + clgname);

    }
}

public class static_var {
    public static void main(String[] args) {

        stat aa = new stat(100, "surbhi");
        stat bb = new stat(101, "shreya");
        aa.display();
        bb.display();

    }

}
