package Homework6;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    public void run(String name, Integer distance) {
        if (distance <= 200) {
            super.run(name, distance);
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swim(String name, Integer distance) {
        System.out.println(name + " не умеет плавать");
    }

}
