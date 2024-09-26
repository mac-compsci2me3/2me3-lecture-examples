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
        String bloodTypeDescription = this.bloodType.equals(BloodType.Warm) ? "warm-blooded" : "cold-blooded";
        return "This " + bloodTypeDescription + " animal is a " + this.diet + " and " +
                (this.vertebrate ? "a vertebrate." : "an invertebrate.");
    }

    enum BloodType {Warm, Cold};
}
