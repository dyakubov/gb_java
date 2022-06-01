package java2.lesson2;

public class MyArraySizeException extends Exception{
    private static final String ERROR_MESSAGE = "Wrong array size: [%d][%d], expected: [%d][%d]";

    public MyArraySizeException(String[][] arr, int size) {
        super(String.format(ERROR_MESSAGE, arr.length, arr[0].length, size, size));

    }
}
