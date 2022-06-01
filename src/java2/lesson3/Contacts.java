package java2.lesson3;

import java.util.*;

public class Contacts {
    private final Map<String, ArrayList<String>> contacts = new HashMap<>();

    public void add(String lastname, String phone){
        if (contacts.containsKey(lastname)){
            contacts.get(lastname).add(phone);
        } else contacts.put(lastname, new ArrayList<>(List.of(phone)));
    }

    public ArrayList<String> get(String lastname){
        return contacts.get(lastname);
    }

    public void printPhonesByLastname(String lastname){
        for (String s : this.get(lastname)) {
            System.out.printf("%s : %s\n", lastname, s);
        }
    }
}
