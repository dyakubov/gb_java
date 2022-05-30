package java2.lesson2;

public class MyArrayDataException extends Exception{
    private static final String ERROR_MESSAGE = "Can't wrap [%d][%d]='%s' to int";

    public MyArrayDataException(int x, int y, String s) {
        super(String.format(ERROR_MESSAGE, x, y, s));
    }

    public MyArrayDataException() {
    }

}
