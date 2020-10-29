package folder;
import java.lang.Thread; 

public class Multi implements Runnable {
    int value = 0; 
    public void run() {
        for (int i = 0; i < 100; i++) {{
            value++;
        }}
    }

    public static void main(String args[]) {
        System.out.println("Running");
        Meal m1 = new Meal(); 
        Thread t1 = new Producer(m1);
        Thread t2 = new Consumer(m1);
        t1.start();
        t2.start();
    }
}