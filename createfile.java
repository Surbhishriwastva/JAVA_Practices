
import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try {
            File myobj = new File("file1.txt");
            if (myobj.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");

        }

    }
}
