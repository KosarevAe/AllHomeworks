package Homework7;

import java.util.Scanner;

public class Homework7 {

    public static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество еды");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Кот '%s (Голод: %d)' голоден?: %s%n";
                    cat.getName(),
                    !cat.isSatiety(),
                    cat.getAppetite());
        }
    }

    public static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("---Info---");
        plate.info();
        printInfo(cats);
        System.out.println("---------");
        System.out.println();
    }

    public static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Кот %s съел ?: %s%n", cat.getName(), result);
        }
        System.out.println();
    }
}
