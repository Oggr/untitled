package HomeWorkApp6;

public abstract class Animal {

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    protected int run;
    protected int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
        counter++;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                " Максимальная дистанция бега : " + run +
                ",  Максимальная дистанция плавания : " + swim +
                '}';
    }
}
