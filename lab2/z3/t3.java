package z3;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for vertex 1:");
        PPoint vertex1 = PPoint.inputPoint(scanner);
        System.out.println("Enter coordinates for vertex 2:");
        PPoint vertex2 = PPoint.inputPoint(scanner);
        System.out.println("Enter coordinates for vertex 3:");
        PPoint vertex3 = PPoint.inputPoint(scanner);

        Triangle triangle;
        try {
            triangle = new Triangle(vertex1, vertex2, vertex3);
        } catch (IllegalArgumentException e) {
            System.out.println("Triangle cannot be created: " + e.getMessage());
            return;
        }

        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Centroid of triangle: " + triangle.centroid());

        scanner.close();
    }
}

