package java1.lesson1;

//Task 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-2,2);
        printColor(101);
        compareNumbers(3, 2);
    }
    //Task 2
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Task 3
    public static void checkSumSign(int a, int b){
        if ((a + b) >= 0){
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    //Task 4
    public static void printColor(int value){
        if (value <= 0){
            System.out.println("Красный");
        } else if (value <=100){
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    //Task 5
    public static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
