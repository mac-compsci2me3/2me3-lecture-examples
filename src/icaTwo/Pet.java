package icaTwo;

public class Pet extends Animal {
    protected String name;

    public Pet(boolean vertebrate, String diet, BloodType bloodType, String name) {
        super(vertebrate, diet, bloodType);
        this.name = name;
    }

    public Pet(){
        
    }

    @Override
    public String toString() {
        return "This pet's name is " + this.name + ". " + super.toString();
    }
}