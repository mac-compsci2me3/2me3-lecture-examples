package icaTwo;

import icaTwo.Animal.BloodType;

public class TestAnimal {
    public static void main(String[] args) {
        // Test the Animal class
        Animal animal1 = new Animal(true, "herbivore", BloodType.Warm);
        Animal animal2 = new Animal(false, "carnivore", BloodType.Cold);
        
        System.out.println(animal1); 
        System.out.println(animal2);  
        
        // // Test the Pet class
        Pet pet1 = new Pet(true, "herbivore", BloodType.Warm, "Bunny");
        Pet pet2 = new Pet(false, "omnivore", BloodType.Cold, "Turtle");
        
        System.out.println(pet1);  
        System.out.println(pet2);  
        
        // // Test the Dog class
        // Dog dog1 = new Dog("Lab", "Labrador");
        // Dog dog2 = new Dog("Bobby", "Bernedoodle");
        
        // System.out.println(dog1);  
        // System.out.println(dog2);  

        // // Test the Soundable interface
        // dog1.makeSound();  
        // dog2.makeSound();  

        // // Test the Trainable interface
        // dog1.performTrick();  
        // dog2.performTrick();  

    }
}
