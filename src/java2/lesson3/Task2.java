package java2.lesson3;

public class Task2 {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.add("Yakubov", "9261057363");
        contacts.add("Yakubov", "9263190235");
        contacts.add("Ivanov", "1234567890");
        contacts.add("Petrov", "2345678901");
        contacts.add("Petrov", "56423234234");

        contacts.printPhonesByLastname("Yakubov");
        contacts.printPhonesByLastname("Ivanov");
        contacts.printPhonesByLastname("Petrov");

    }
}
