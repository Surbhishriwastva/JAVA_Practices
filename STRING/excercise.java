package STRING;

public class excercise {
    public static void couunting(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        // String str = "STUVikeO";
        // String st = "ShradhaDidi";
        // String st1 = "Apanacollege";
        // String st2 = "ShradhaDidi";
        // System.out.println(st.equals(st1) + " " + st.equals(st2));
        // // 1 couunting(str);
        String stp = "ApnaCollege".replace("S", " p");
        System.out.println(stp);
    }
}
