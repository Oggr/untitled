package HomeWorkApp6;

public class Cat extends Animal {

    public static final int MAX_RUN = 200;
    public static final int MAX_SWIM = 0;

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public Cat(int run) {
        super(run, MAX_SWIM);
        counter++;
    }

    public Cat() {
        this(MAX_RUN);
    }

    @Override
    public boolean run(int distance) {
        if (this.run >= distance) {
            System.out.printf("Кот смог пробежать дистанцию %d. Max = %d%n", distance, run);
            return true;
        }

        System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distance, run);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Коты не умеют плавать!!!");
        return false;
    }

}
