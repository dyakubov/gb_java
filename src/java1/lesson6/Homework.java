package java1.lesson6;

public class Homework {
    public static final int DOG_RUN_LIMIT = 500;
    public static final int CAT_RUN_LIMIT = 200;
    public static final int DOG_SWIM_LIMIT = 10;

    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Клык");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Рыжий");
        Cat cat3 = new Cat("Тоша");

        dog1.run(400);
        dog1.swim(100);
        dog2.run(600);
        dog2.swim(5);

        cat1.run(200);
        cat1.swim(100);
        cat2.run(300);
        cat2.swim(5);
        cat3.run(300);
        cat3.swim(5);

        System.out.println("Animals: " + Animal.getAnimalsCount());
        System.out.println("Dogs: " + Dog.getCount());
        System.out.println("Cats: " + Cat.getCount());

    }
}
