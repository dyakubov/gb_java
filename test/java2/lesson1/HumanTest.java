package java2.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void runMarathon() {
        Human human1 = new Human(1, 200, 30); //true
        Human human2 = new Human(2,1, 30); //false
        Human human3 = new Human(3, 200, 1); //false

        Treadmill[] treadmills = new Treadmill[3];
        Wall[] walls = new Wall[3];

        treadmills[0] = new Treadmill(1);
        treadmills[1] = new Treadmill(50);
        treadmills[2] = new Treadmill(101);

        walls[0] = new Wall(1);
        walls[1] = new Wall(10);
        walls[2] = new Wall(20);

        Assertions.assertTrue(human1.runMarathon(treadmills, walls));
        Assertions.assertFalse(human2.runMarathon(treadmills, walls));
        Assertions.assertFalse(human3.runMarathon(treadmills, walls));
    }
}