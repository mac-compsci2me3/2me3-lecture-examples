package week4Example;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Implementing the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}