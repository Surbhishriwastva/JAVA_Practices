// import java.util.*;

// class A {
//     void message() {
//         System.out.println("this is base class");
//     }
// }

// class B extends A {
//     void message() {
//         System.out.println("this is derived class");
//     }
// }

// public class method_overriding {
//     public static void main(String[] args) {

//         B aa = new B();
//         aa.message();
//     }

// }
/*
 * it gives only the output of derived b/c name is same nd object is always
 * created of derived class
 * or wo usi class me mil jayegaa to upper dhundega hi nhi
 * final is used to come out of this prb
 */
import java.util.*;

class A {
    final void message() { // in future we cant created function with same name
        System.out.println("this is base class");
    }
}

class B extends A {
    void message1() {
        System.out.println("this is derived class");
    }
}

public class method_overriding {
    public static void main(String[] args) {

        B aa = new B();
        aa.message();
    }

}
