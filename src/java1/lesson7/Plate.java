package java1.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n){
            food -= n;
            return true;
        }
        return false;
    }

    public void increaseFood(int n){
        setFood(food + n);
        System.out.println("Тарелка пополнена на " + n + " еды");
    }
}
