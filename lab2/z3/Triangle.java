package z3;

public class Triangle {
    private PPoint vertex1;
    private PPoint vertex2;
    private PPoint vertex3;

    public Triangle(PPoint vertex1, PPoint vertex2, PPoint vertex3) {
        if ((vertex1.getX() - vertex2.getX()) * (vertex1.getY() - vertex3.getY()) !=
                (vertex1.getX() - vertex3.getX()) * (vertex1.getY() - vertex2.getY())) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.vertex3 = vertex3;
        } else {
            throw new IllegalArgumentException("The points are on the same line");
        }
    }

    public double area() {
        double a = distance(vertex1, vertex2);
        double b = distance(vertex2, vertex3);
        double c = distance(vertex3, vertex1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private double distance(PPoint p1, PPoint p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public PPoint centroid() {
        double x = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double y = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new PPoint(x, y);
    }
}
