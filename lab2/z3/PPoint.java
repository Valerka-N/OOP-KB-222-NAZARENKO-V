package z3;

import java.util.Scanner;

public class PPoint {
    private double x;
    private double y;

    public PPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static PPoint inputPoint(Scanner scanner) {
        System.out.println("Enter coordinates:");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        return new PPoint(x, y);
    }
}
