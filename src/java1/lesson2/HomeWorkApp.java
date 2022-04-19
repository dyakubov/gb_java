package java1.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(isSumFrom10To20(16,5));
        checkNumberPositiveOrNegative(-1);
        System.out.println(isNumberNegative(-1));
        printString("Hello", 5);
        System.out.println(isYearLeap(2000));
    }

    //Task 1
    public static boolean isSumFrom10To20(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //Task 2
    public static void checkNumberPositiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Task 3
    public static boolean isNumberNegative(int a){
        return a < 0;
    }

    //Task 4
    public static void printString(String s, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    //Task 5
    public static boolean isYearLeap (int year){
        if (year % 4 == 0){
            return year % 100 != 0 || year % 400 == 0;
        } else {
            return false;
        }
    }
}
