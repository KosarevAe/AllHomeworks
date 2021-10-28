package Homework7;

import static Homework7.Homework7.*;

public class TestCatEating {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Alex", 8),
                new Cat("Persik", 2),
        };

        Plate plate = new Plate(15);

        printInfo(cats,plate);
        haveLunch(cats,plate);

        printInfo(cats,plate);

        addFood(plate);

        System.out.println("Еда добавлена: ");
        plate.info();
        System.out.println();

        haveLunch(cats,plate);
        printInfo(cats,plate);
    }
}