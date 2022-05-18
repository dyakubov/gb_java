package java2.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotTest {

    @Test
    void runMarathon() {

        Robot robot1 = new Robot(1, 200, 30); //true
        Robot robot2 = new Robot(2,1, 30); //false
        Robot robot3 = new Robot(3, 200, 1); //false

        Treadmill[] treadmills = new Treadmill[3];
        Wall[] walls = new Wall[3];

        treadmills[0] = new Treadmill(1);
        treadmills[1] = new Treadmill(50);
        treadmills[2] = new Treadmill(101);

        walls[0] = new Wall(1);
        walls[1] = new Wall(10);
        walls[2] = new Wall(20);

        Assertions.assertTrue(robot1.runMarathon(treadmills, walls));
        Assertions.assertFalse(robot2.runMarathon(treadmills, walls));
        Assertions.assertFalse(robot3.runMarathon(treadmills, walls));
    }
}