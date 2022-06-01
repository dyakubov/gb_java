package java2.lesson2;

public class HomeWork {
    static final int SIZE = 4;

    public static void main(String[] args) {
        String[][][] arrays = {
                {
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"}
                },
                {
                        {"1", "1", "1", "1"},
                        {"1", "1", "A", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"}
                },

                {
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"}
                }};

        for (String[][] a : arrays) {
            try {
                System.out.println(sumNumbersFromStrings(a));
            } catch (MyArrayDataException | MyArraySizeException e) {
                e.printStackTrace();
            }
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


