package week4Example;

class Square extends Shape {
    private double side;

    public Square(double side)  {
        super("Square");
        this.side = side;
    }

    // Implementing the area method
    @Override
    public double area() {
        return side * side;
    }
}
