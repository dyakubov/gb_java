package java2.lesson1;

public class Cat implements MarathonRunner {
    private final int id;
    private final double runLimit;
    private final double jumpLimit;

    public Cat(int id, int runLimit, int jumpLimit) {
        this.id = id;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    public boolean runMarathon(Treadmill[] treadmills, Wall[] walls) {
        for (Treadmill t : treadmills) {
            if (!Actions.run(t.getDistance(), this.runLimit)){
                System.out.println("Бег: Кот" + id + " выбыл");
                return false;
            }
            System.out.println("Бег: Кот " + id + " пробежал " + t.getDistance() + " м.");
        }

        for (Wall w : walls) {
            if (!Actions.jump(w.getHeight(), this.jumpLimit)){
                System.out.println("Прыжок: Кот " + id + " выбыл");
                return false;
            }
            System.out.println("Прыжок: Кот " + id + " прыгнул " + w.getHeight() + " м.");
        }
        return true;
    }
}
