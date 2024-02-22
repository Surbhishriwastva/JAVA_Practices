import javax.sound.sampled.SourceDataLine;

public class multithreading {
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();
        C thread3 = new C();
        System.out.println("Thread A is being started......");
        thread1.start();
        System.out.println("thread B is being started.....");
        thread2.start();
        System.out.println("thread c is being started  .... ");
    }

}

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                yield();
            System.out.println("\n from Thread A: i=" + i);
        }
        System.out.println("end of thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\n from thread B: j =" + j);
            if (j == 3)
                stop();
        }

    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\n from thread c : k= " + k);
            if (k == 1)
                try {
                    sleep(1000);
                } catch (Exception e) {

                }
        }
        System.out.println("end of thread c ");

    }
}