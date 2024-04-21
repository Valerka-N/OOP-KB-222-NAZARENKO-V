package z1;
import java.util.Scanner;

public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "y = " + k + "x + " + b;
    }

    public Point intersection(Line line) {
        double x = (line.getB() - this.getB()) / (this.getK() - line.getK());
        double y = this.getK() * x + this.getB();
        return new Point(x, y);
    }

    public static Line inputLine(Scanner scanner) {
        System.out.println("");
        System.out.print("k: ");
        double k = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        return new Line(k, b);
    }
}




