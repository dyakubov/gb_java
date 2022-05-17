package java1.lesson7;

public class HomeWork {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[21];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(String.valueOf(i + 1), 5);
        }

        for (Cat cat : cats) {
            if (plate.getFood() < cat.getAppetite()){
                plate.increaseFood(50);
            }
            System.out.println("Еды в тарелке: " + plate.getFood());
            cat.eat(plate);
            System.out.println("Еды в тарелке: " + plate.getFood());
            System.out.println();
        }
    }
}
