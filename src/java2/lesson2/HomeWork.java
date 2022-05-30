package java2.lesson2;

public class HomeWork {
    static final int SIZE = 4;

    public static void main(String[] args) {

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
            System.out.println(sumNumbersFromStrings(arr1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumNumbersFromStrings(arr2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumNumbersFromStrings(arr3));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static int sumNumbersFromStrings(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) throw new MyArraySizeException(arr, SIZE);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr[i][j]);
                }
            }
        }
        return sum;
    }
}


