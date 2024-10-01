package fifthWeek;

public class Animal {
    int age = 5;
    String name = "Unknown";
    static String type;

    Animal() {
        System.out.println("Animal constructor called");
    }

    Animal(int age) {
        this(); 
        System.out.println("Animal constructor with age called");
        this.age = age;
    }
}







