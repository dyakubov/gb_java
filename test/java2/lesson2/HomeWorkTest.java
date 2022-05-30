package java2.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest {

    @Test
    void sumNumbersFromStrings() {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] arr2 = {
                {"1", "1", "1", "1"},
                {"1", "%", "1", "1"},
                {"1", "1", "A", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] arr3 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "A", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println(HomeWork.sumNumbersFromStrings(arr1));

        } catch (MyArrayDataException | MyArraySizeException e) {
            Assertions.fail("Sum of array's elements expected");
            e.printStackTrace();
        }

        try {
            HomeWork.sumNumbersFromStrings(arr2);
            Assertions.fail("MyArrayDataException expected");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
            Assertions.assertNotEquals("", e.getMessage());

        }

        try {
            HomeWork.sumNumbersFromStrings(arr3);
            Assertions.fail("MyArraySizeException expected");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
            Assertions.assertNotEquals("", e.getMessage());
        }
    }
}