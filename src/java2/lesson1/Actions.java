package java2.lesson1;

public class Actions {
    // Общие методы сделал статическими
    public static boolean run(double distance, double runLimit){
        return distance <= runLimit;
    }

    public static boolean jump(double height, double jumpLimit){
        return height <= jumpLimit;
    }



}
