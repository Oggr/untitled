package HomeWorkApp6;

import java.util.Random;

public class Competitions {

    public static void main(String[] args) {
        Animal[] participants = competitionParticipants();
        playGame(participants);
    }

    private static Animal[] competitionParticipants() {
        return new Animal[] {
          new Cat(),
          new Dog(),
          new Cat(300),
          new Cat(400),
          new Dog(1000, 100)
        };
    }

    private static void playGame(Animal[] participants) {
        Random random = new Random();

        for (Animal participant : participants) {
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.swim(random.nextInt(100)));
            System.out.println();
        }

        System.out.println(Animal.getCounter());
        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());
    }

}
