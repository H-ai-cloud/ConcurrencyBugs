package folder;

public class Meal {
    private int meals = 0; 
    public void produce() {
        this.meals++;
        printAvailability();
    }

    public void consume() {
        this.meals--;
        printAvailability();
    }

    public void printAvailability() {
        System.out.format("Mals: %d\n", meals);
    }
}