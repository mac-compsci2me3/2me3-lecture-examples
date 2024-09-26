package week4Example;

import java.util.List;

class ShapeUtils {
    public static Shape largestArea(List<Shape> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        Shape largest = shapes.get(0);
        for (Shape shape : shapes) {
            System.out.println(shape + " area: " + shape.area());
            if (shape.area() > largest.area()) {
                largest = shape;
            }
        }

        System.out.println("The shape with the largest area is: " + largest + " with an area of " + largest.area());
        return largest;
    }
}