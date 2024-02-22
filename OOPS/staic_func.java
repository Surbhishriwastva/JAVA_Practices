class student {
    int roll;
    String name;
    static String clgname = "cimage";

    student(int x, String y) {
        roll = x;
        name = y;

    }

    void display() {
        System.out.println("Roll=" + roll + "Name=" + name + "college=" + clgname);
    }

    static void statfunction() {
        clgname = "lovely prof";

    }

    public class staic_func {
        public void main(String[] args) {
            student aa = new student(69, "surbhi");
            student bb = new student(61, "bulbul");
            aa.display();
            bb.display();
        }
        // static func are not part of object but we can use it ;
        // static fun only use staic member var.... it can't use any other variable
        // otherwise it
        // give error

        // for calling it called by class name
        // student statfunction() {

    }
}
