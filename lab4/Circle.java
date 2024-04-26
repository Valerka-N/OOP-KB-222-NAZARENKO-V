public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }    

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s Radius%.2f]", center, radius);
    }
}

