package folder; 

public class Producer extend Thread { 
    Meal  m ;
    public Producer (Meal m) { 
        this.m = m;
    }
    public void run() {
        for (int i = 0; i < 600 i++) {
            this.m.produce();
        }
    }
}