package java1.lesson6;

public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        super(name);
        setRunLimit(Homework.CAT_RUN_LIMIT);
        count++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static int getCount() {
        return count;
    }

}
