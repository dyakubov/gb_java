package java2.lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] words = new String[] {
                "january",
                "january",
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december",
                "january",
                "february",
                "march",
                "april",
                "may",
                "june"
        };
        System.out.println(new HashSet<>(Arrays.asList(words)));

        Map<String, Integer> uniq = new HashMap<>();

        for (String s : words) {
            if (uniq.containsKey(s)){
                uniq.put(s,uniq.get(s) + 1);
            } else uniq.put(s, 1);
        }

        for (Map.Entry<String, Integer> o : uniq.entrySet()) {
            System.out.printf("%s : %d\n", o.getKey(), o.getValue());
        }
    }
}
