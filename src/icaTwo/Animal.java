package icaTwo;

public class Animal {
    protected boolean vertebrate;
    protected String diet;
    protected BloodType bloodType;

    public Animal(boolean vertebrate, String diet, BloodType bloodType) {
        this.vertebrate = vertebrate;
        this.diet = diet;
        this.bloodType = bloodType;
    }

    public Animal(){
        
    }

    @Override
    public String toString() {
        String animalDescription = "";
        return animalDescription;
    }

    // Honestly it is totally okay to use String for bloodtype but just incase you want to see how enumerators might be used in a class
    // by default they will be public, static final
    enum BloodType {Warm, Cold};
}
