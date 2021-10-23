package Homework6;

public class Animals {

    private final String name;

    public Animals(String name) {
        this.name = name;
    }

    public void run(String name, Integer distance) {
        System.out.println(name + " пробежал(-a):" + distance + " метров\n");
    }

    public void swim(String name, Integer distance) {
        System.out.println(name + " проплыл(-a):" + distance + " метров\n");
    }

    public static void main(String[] args) {
        Animals firstAnimal = new Animals("Животное");
        Cat firstCat = new Cat("Барсик");
        Dog firstDog = new Dog("Бобик");
        Cat secondCat = new Cat("Персик");

        firstAnimal.run("Животное", 600);
        firstAnimal.swim("Животное", 1000);

        System.out.println("-----------------");

        firstCat.run("Барсик", 100);
        firstCat.swim("Барсик", 5);

        System.out.println("-----------------");

        secondCat.run("Персик", 100);
        secondCat.swim("Персик", 5);

        System.out.println("-----------------");

        firstDog.run("Бобик", 450);
        firstDog.swim("Бобик", 15);

    }

}


