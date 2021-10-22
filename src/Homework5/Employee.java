package Homework5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private Integer salary;
    private Integer age;

    public Employee(String fio, String position, String email, String phoneNumber, Integer salary, Integer age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Сотрудник: " + fio + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age);
    }

    public boolean employeeAgeMoreThanForty(){
        if(this.age > 40){
            return true;
        }
        return false;
    }
}
