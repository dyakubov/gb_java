package java1.lesson6;

public class Dog extends Animal {

    private static int count;

    public Dog(String name) {
        super(name);
        setRunLimit(Homework.DOG_RUN_LIMIT);
        setSwimLimit(Homework.DOG_SWIM_LIMIT);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

