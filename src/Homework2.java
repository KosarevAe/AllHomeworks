public class Homework2 {
    public static void main(String[] args) {
        boolean one = first(5, 10);
        System.out.println(one);

        second(-1);

        boolean three = third(10);
        System.out.println(three);

        fourth("foo", 5);

        boolean five = fifth(2021);
        System.out.println(five);
    }

    public static boolean first(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    public static void second(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean third(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void fourth(String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }

    public static boolean fifth(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

}
