package thirdWeek;
import thirdWeek.*;

public class RightTriangle extends Triangle {

    // Constructor for RightTriangle
    public RightTriangle(double[] sides) {
        super(sides); // Call the constructor of the Triangle class

        // Validate if the sides form a right triangle using the Pythagorean theorem
        if (!isRightTriangle()) {
            throw new IllegalArgumentException("The given sides do not form a right triangle.");
        }
    }

    // Method to check if it's a right triangle using the Pythagorean theorem
    private boolean isRightTriangle() {
        double eps = 1e-6; // small epsilon for double comparison
        return Math.abs(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) < eps ||
               Math.abs(Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) < eps ||
               Math.abs(Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) < eps;
    }

    // Override the area method to calculate the area of a right triangle
    public double area() {
        return 0.5 * this.a * this.b; // Area of a right triangle: 1/2 * base * height
    }

    // Main method to test the RightTriangle class
    public static void main(String[] args) {
       
    }
}
