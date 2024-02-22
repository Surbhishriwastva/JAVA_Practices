// import javax.sound.sampled.SourceDataLine;

class pen {
    String color;

    public void printcolor() {
        System.out.println("This colors of this pen " + this.color);
    }
}

public class OOPS {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.color = "blue";
        p1.printcolor();

    }

}
