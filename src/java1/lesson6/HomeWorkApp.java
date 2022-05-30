package java1.lesson6;

import java2.lesson1.Robot;
import java2.lesson1.Treadmill;
import java2.lesson1.Wall;

public class HomeWorkApp {
    public static void main(String[] args) {
        Robot[] robots = new Robot[3];
        Robot robot1 = new Robot(50, 10, 1);
        Robot robot2 = new Robot(100, 20, 2);
        Robot robot3 = new Robot(200, 30, 3);
        robots[0] = robot1;
        robots[1] = robot2;
        robots[2] = robot3;

        double minDistance = 50;
        double minHeight = 10;

        Treadmill[] treadmills = new Treadmill[3];
        Wall[] walls = new Wall[3];

        for (int i = 0; i < 3; i++) {
            treadmills[i] = new Treadmill(minDistance);
            walls[i] = new Wall(minHeight);
            minDistance += 50;
            minHeight += 50;
        }

        for (Robot r : robots) {
            r.runMarathon(treadmills, walls);
        }
    }
}
