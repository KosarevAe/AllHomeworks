package Homework6;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    public void run(String name, Integer distance) {
        if (distance <= 500) {
            super.run(name, distance);
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swim(String name, Integer distance) {
        if (distance <= 10) {
            super.run(name, distance);
        } else {
            System.out.println(name + " не может столько проплыть");
        }
    }

}
