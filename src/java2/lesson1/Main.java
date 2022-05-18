package java2.lesson1;

public class Main {
    public static void main(String[] args) {
        Robot[] robots = new Robot[]{
                new Robot(1, 200, 30),
                new Robot(2, 1, 30),
                new Robot(3, 200, 1)
        };

        Human[] humans = new Human[]{
                new Human(1, 200, 30),
                new Human(2, 1, 30),
                new Human(3, 200, 1)
        };

        Cat[] cats = new Cat[]{
                new Cat(1, 200, 30),
                new Cat(2, 1, 30),
                new Cat(3, 200, 1)
        };

        Treadmill[] treadmills = new Treadmill[]{
                new Treadmill(1),
                new Treadmill(50),
                new Treadmill(101)
        };

        Wall[] walls = new Wall[]{
                new Wall(1),
                new Wall(10),
                new Wall(20)
        };

        Marathon marathon = new Marathon(robots, humans, cats, treadmills, walls);
        marathon.start();
    }
}
