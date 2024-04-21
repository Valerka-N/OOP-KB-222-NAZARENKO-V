package z2;

import java.util.Scanner;

public class Pointt {
    private double x;
    private double y;

    public Pointt(double x, double y) {
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

    public static Pointt inputPoint(Scanner scanner) {
        System.out.println("");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        return new Pointt(x, y);
    }
}


