package HomeWorkApp7;

class Plate {

    public int food;
    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
        System.out.println("Недостаточно еды, добавили ещё " + food);

    }
    void info() {
        System.out.println("В тарелке осталось : " + food);
    }
}