package icaTwo;

public interface Soundable {
    // attributes are static final - constant
    String DEFAULT_SOUND = "Silent";

    // default methods are method with default implmentation 
    // but can be overridden if needed
    default void playDefaultSound() {
        System.out.println(DEFAULT_SOUND);
    }

    // same as the above
    default String soundDetails() {
        return "This object can make a sound.";
    }

    // can be called without needing an instance 
    // Soundable.genericSoundMessage(); 
    static void genericSoundMessage() {
        System.out.println("Sounds can vary greatly between different objects.");
    }

    // abstract method
    void makeSound();  
}

