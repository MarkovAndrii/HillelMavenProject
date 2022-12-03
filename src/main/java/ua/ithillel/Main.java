package ua.ithillel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        Person person = new Person();
        person.setName("Ric");
        Person person1 = new Person("Tom", "Stone", 25);

        System.out.println(person.toString());
        System.out.println(person.getName());
        System.out.println(person1.toString());
    }
}
