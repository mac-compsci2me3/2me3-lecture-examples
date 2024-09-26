package icaTwo;

public class Cat extends Pet implements Soundable{
    protected String breed;

    // public Cat(String name, String breed) {
    //     super(true, "omnivore", "warm", name);
    //     this.breed = breed;
    // }

    @Override
    public void makeSound() {
        System.out.println("Cat meows:"); 
        System.out.println("Meow!");  
    }

    @Override
    public String toString() {
        return "This pet's name is " + this.name + ". " +
                "This pet is a " + this.breed + ".";
    }

    // @Override
    // public void performTrick() {
    //     System.out.println(this.name + " is performing a handshake trick!"); 
    // }
}
