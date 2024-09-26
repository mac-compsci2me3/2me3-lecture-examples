package week4Example;

// Why? Shape can also be a concrete class


abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return name;
    }

    public boolean isSmallerThan(Shape other) {
        return this.area() < other.area();
    }
}


// you can define an abstract method and force the subclass to have their own implementation
// so might be inconsitentcies in the method behavior 

// clarity of intenet - shape is a usable type - misuse 

// abstract provides flexibility to have both conctete and abstract