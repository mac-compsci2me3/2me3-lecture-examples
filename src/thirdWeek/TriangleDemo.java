package thirdWeek;

public class TriangleDemo {
    public static void main(String[] args) {
        double[] sides = {3, 4, 5};
        Triangle triangle = new Triangle(sides);

        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Area: " + triangle.area());

        //
        // RightTriangle triangle2 = new RightTriangle(sides);

        // System.out.println("Perimeter: " + triangle2.perimeter());
        // System.out.println("Area: " + triangle2.area());
    }
}
