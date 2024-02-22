import java.io.*;

public class filerename {
    public static void main(String[] args) {

        File f = new File("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\file1.txt");
        File r = new File("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\surbhi.txt");
        if (f.exists()) {
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("file not exist");
        }
    }

}
