package fifthWeek;

public class TestPuppy {
    public static void main(String[] args) {
        Puppy puppyObj = new Puppy();

        System.out.println(puppyObj.age);   
        System.out.println(puppyObj.name);  
        // you will get warning from the code below since type is set up as a static variable but not accessed in a static way
        // the proper way to access type should be Animal.type
        // but the code will run
        System.out.println(puppyObj.type);  

        // Here are the expected output from the code above
        // Animal constructor called
        // Animal constructor with age called
        // Dog constructor called
        // Puppy constructor called
        // 3
        // Unknown
        // null
    }
}