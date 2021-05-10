package HomeWorkApp7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Амадеус", 15),
                      new Cat("Бася", 45),
                      new Cat("Томик", 25),
                      new Cat("Маллой", 45),
                      new Cat("Техас", 10)};

        Plate plate = new Plate( 100);


        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
        plate.info();
        plate.addFood(20);

    }
}