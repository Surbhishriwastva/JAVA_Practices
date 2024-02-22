import java.io.*;

public class fileinfo {
    public static void main(String[] args) {
        File f = new File("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\file1.txt");
        if (f.exists()) {
            System.out.println("filename" + f.getName());
            System.out.println("filelocation" + f.getAbsolutePath());
            System.out.println("filewritable" + f.canWrite());
            System.out.println("filereadable" + f.canRead());
            System.out.println("file size" + f.length());
        } else {
            System.out.println("file doesn't exists");
        }
    }

}
