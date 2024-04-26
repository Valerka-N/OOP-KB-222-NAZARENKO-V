public class Triangle extends Figure {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        if (isDegenerate(A, B, C)) {
            throw new IllegalArgumentException("Triangle is degenerate.");
        }
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double calculateArea() {
        double sideA = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
        double sideB = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
        double sideC = Math.sqrt(Math.pow(A.getX() - C.getX(), 2) + Math.pow(A.getY() - C.getY(), 2));

        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public Point centroid() {
        double centerX = (A.getX() + B.getX() + C.getX()) / 3.0;
        double centerY = (A.getY() + B.getY() + C.getY()) / 3.0;
        return new Point(centerX, centerY);
    }

    @Override
    public String toString() {
        return String.format("Triangle[A%s B%s C%s]", A, B, C);
    }

    private boolean isDegenerate(Point A, Point B, Point C) {
        double area = 0.5 * ((B.getX() - A.getX()) * (C.getY() - A.getY()) - (B.getY() - A.getY()) * (C.getX() - A.getX()));
        return Math.abs(area) < EPSILON;
    }

    private static final double EPSILON = 1e-10;
}

