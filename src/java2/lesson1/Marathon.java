package java2.lesson1;

public class Marathon {
    Robot[] robots;
    Human[] humans;
    Cat[] cats;
    Treadmill[] treadmills;
    Wall[] walls;

    public Marathon(Robot[] robots, Human[] humans, Cat[] cats, Treadmill[] treadmills, Wall[] walls) {
        this.robots = robots;
        this.humans = humans;
        this.cats = cats;
        this.treadmills = treadmills;
        this.walls = walls;
    }

    public void start() {
        for (Robot robot : robots) {
            robot.runMarathon(treadmills, walls);
        }
        for (Human human : humans) {
            human.runMarathon(treadmills, walls);
        }
        for (Cat cat : cats) {
            cat.runMarathon(treadmills, walls);
        }
    }
}
