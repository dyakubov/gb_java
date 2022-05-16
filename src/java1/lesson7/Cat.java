package java1.lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public boolean eat(Plate plate){
        if (plate.decreaseFood(appetite)){
            setSatiety(true);
            System.out.println("Кот " + name + " поел");
            return true;
        }
        System.out.println("Кот " + name + " не поел");
        return false;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite(){
        return appetite;
    }
}
