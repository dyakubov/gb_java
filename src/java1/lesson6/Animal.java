package java1.lesson6;

public class Animal {

    private final String name;
    private int runLimit;
    private int swimLimit;
    private static int animalsCount;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public void run(int distance) {
        if (distance <= this.runLimit) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        } else System.out.println(this.name + ": Превышен лимит бега");
    }

    public void swim(int distance) {
        if (distance <= this.swimLimit) {
            System.out.println(this.name + " проплыл " + distance + " м.");
        } else System.out.println(this.name + ": Превышен лимит плавания");
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
