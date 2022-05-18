package java2.lesson1;

public class Robot {
    private final int id;
    private final double runLimit;
    private final double jumpLimit;

    public Robot(int id, int runLimit, int jumpLimit) {
        this.id = id;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean run(Treadmill t) {
        if (t.getDistance() <= this.runLimit) {
            System.out.println("Бег: Робот " + id + " пробежал " + t.getDistance() + " м.");
        } else {
            System.out.println("Бег: Робот" + id + " выбыл");
            return false;
        }
        return true;
    }

    public boolean jump(Wall w) {
        if (w.getHeight() <= this.jumpLimit) {
            System.out.println("Прыжок: Робот " + id + " прыгнул " + w.getHeight() + " м.");
        } else {
            System.out.println("Прыжок: Робот " + id + " выбыл");
            return false;
        }
        return true;
    }

    public boolean runMarathon(Treadmill[] treadmills, Wall[] walls) {
        for (Treadmill t : treadmills) {
            if (!this.run(t)) return false;
        }
        for (Wall w : walls) {
            if (!this.jump(w)) return false;
        }
        return true;
    }

}


