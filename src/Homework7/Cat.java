package Homework7;

public class Cat {

    private final int appetite;
    private final String name;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    private String checkEat(Plate plate){
        if(!plate.isFoodEnough(appetite)){
            return "Еды в тарелке достаточно";
        }
        if(satiety){
            return "Кот сыт";
        }

        return null;
    }

    public boolean isSatiety(){
        return satiety;
    }

    private void doEat(Plate plate){
        plate.decreaseFood(appetite);
    }

    public boolean eat(Plate plate) {
       String validateMessage = checkEat(plate);
       if(validateMessage!=null){
           System.out.println(validateMessage);
           return false;
       }
       doEat(plate);
       satiety=true;
       return true;
    }
}
