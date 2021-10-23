package Homework5;

public class Homework5 {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanovII@net.ru", "89000000000", 500000, 35);
        employeesArray[1] = new Employee("Петров Алексей Владимирович", "Ген. Директор", "petrovAV@net.ru", "89002312220", 1500000, 49);
        employeesArray[2] = new Employee("Алексеев Егор Васильевич", "Программист", "alekseevEV@net.ru", "89123332213", 180000, 26);
        employeesArray[3] = new Employee("Васильев Геннадий Игнатьевич", "Начальник скалада", "vasilyevGI@net.ru", "89886574545", 50000, 43);
        employeesArray[4] = new Employee("Заречный Александр Петрович", "Начальник цеха", "zarechniyAP@net.ru", "89123124442", 75000, 46);


        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].employeeAgeMoreThanForty() == true) {
                employeesArray[i].printInfo();
            }
        }

    }
}

