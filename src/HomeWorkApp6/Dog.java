package HomeWorkApp6;

public class Dog extends Animal {

    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 10;

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public Dog(int run, int swim) {
        super(run, swim);
        counter++;
    }

    public Dog() {
        this(MAX_RUN, MAX_SWIM);
    }

    @Override
    public boolean run(int distance) {
        if (this.run >= distance) {
            System.out.printf("Собака смогла пробежать дистанцию %d. Max = %d%n", distance, run);
            return true;
        }

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, run);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.swim >= distance) {
            System.out.printf("Собака смогла переплыть дистанцию %d. Max = %d%n", distance, swim);
            return true;
        }

        System.out.printf("Собака не смогла переплыть дистанцию %d. Max = %d%n", distance, swim);
        return false;
    }
}
