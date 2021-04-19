public class HomeWorkApp2 {


    public static void main(String[] args) {
        System.out.println(compareNumbers(5, 4));
        checkPlus(110);
        System.out.println(checkMinus(-12));
        repeatStr(3 ,
                "Who let the dogs out?");
        System.out.println(check(1200));
    }


    private static boolean compareNumbers(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }


    private static void checkPlus(int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }


    private static boolean checkMinus(int a) {
        return a < 0;
    }

    public static void repeatStr(int n, String name) {
        int i = 0;
        for (; i < n; i++) {
            System.out.println(name);
        }
    }

    private static boolean check(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
  }
