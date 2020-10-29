package folder; 

public class Consumer extends Thread {
    Meal m; 
    public Consumer(Meal m ) {
        this.m = m;
    }
    public void run() {
        for (int i = 0; i < 600; i++) {
            this.m.consume();
        }
    }
}