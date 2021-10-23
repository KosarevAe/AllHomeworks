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

    public int countAnimals() {
        int count = 0;
        count += 1;
        return count;
    }

    @Override
    public String toString() {
        return "Animals{" + "name='" + name + " " + countAnimals() + '\'' + '}';
    }

    public static void main(String[] args) {
        Animals firstAnimal = new Animals("Животное");
        Animals firstCat = new Cat("Барсик");
        Animals firstDog = new Dog("Бобик");
        Animals secondCat = new Cat("Персик");

        firstAnimal.run("Животное", 600);
        firstAnimal.swim("Животное", 1000);

        System.out.println("-----------------");

        firstCat.run("Барсик", 100);
        firstCat.swim("Барсик", 5);

        System.out.println("-----------------");

        secondCat.run("Персик", 50);
        secondCat.swim("Персик", 5);

        System.out.println("-----------------");

        firstDog.run("Бобик", 450);
        firstDog.swim("Бобик", 15);

        System.out.println("-----------------");
        
        int count = 0;
        Animals[] animalsArray = {firstAnimal, firstCat, secondCat, firstDog};
        for (Animals animals : animalsArray) {
            if (animals instanceof Animals == true) {
                count += 1;
            }
        }
        System.out.println("Животные: " + count);

    }
}


