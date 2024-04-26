public class Quadrilateral extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        if (isDegenerate(A, B, C, D)) {
            throw new IllegalArgumentException("Quadrilateral is degenerate.");
        }
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    public double calculateArea() {
        double length = Math.max(Math.abs(A.getX() - B.getX()), Math.abs(C.getX() - D.getX()));
        double width = Math.max(Math.abs(A.getY() - D.getY()), Math.abs(B.getY() - C.getY()));
        return length * width;
    }
    
    @Override
    public Point centroid() {
        double centerX = (A.getX() + B.getX() + C.getX() + D.getX()) / 4.0;
        double centerY = (A.getY() + B.getY() + C.getY() + D.getY()) / 4.0;
        return new Point(centerX, centerY);
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral[A%s B%s C%s D%s]", A, B, C, D);
    }

    private boolean isDegenerate(Point A, Point B, Point C, Point D) {
        return areCollinear(A, B, C) || areCollinear(A, C, D) || areCollinear(A, B, D) || areCollinear(B, C, D);
    }
    
    private boolean areCollinear(Point A, Point B, Point C) {
        double area = 0.5 * ((B.getX() - A.getX()) * (C.getY() - A.getY()) - (B.getY() - A.getY()) * (C.getX() - A.getX()));
        return Math.abs(area) < EPSILON; 
    }

    private static final double EPSILON = 1e-10; 
}

