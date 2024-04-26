import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figure = null;

        System.out.println("Choose figure to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Quadrilateral");
        System.out.println("3. Circle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                figure = createTriangle(scanner);
                break;
            case 2:
                figure = createQuadrilateral(scanner);
                break;
            case 3:
                figure = createCircle(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
        }

        System.out.println("Figure: " + figure);
        System.out.println("Area: " + figure.calculateArea());
        System.out.println("Centroid: " + figure.centroid());
        
        scanner.close();
    }

    private static Triangle createTriangle(Scanner scanner) {
        System.out.println("Enter coordinates of point A (x y):");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        Point pointA = new Point(ax, ay);

        System.out.println("Enter coordinates of point B (x y):");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        Point pointB = new Point(bx, by);

        System.out.println("Enter coordinates of point C (x y):");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        Point pointC = new Point(cx, cy);

        return new Triangle(pointA, pointB, pointC);
    }

    private static Quadrilateral createQuadrilateral(Scanner scanner) {
        System.out.println("Enter coordinates of point A (x y):");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        Point pointA = new Point(ax, ay);

        System.out.println("Enter coordinates of point B (x y):");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        Point pointB = new Point(bx, by);

        System.out.println("Enter coordinates of point C (x y):");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        Point pointC = new Point(cx, cy);

        System.out.println("Enter coordinates of point D (x y):");
        double dx = scanner.nextDouble();
        double dy = scanner.nextDouble();
        Point pointD = new Point(dx, dy);

        return new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    private static Circle createCircle(Scanner scanner) {
        System.out.println("Enter coordinates of center (x y):");
        double centerX = scanner.nextDouble();
        double centerY = scanner.nextDouble();
        Point center = new Point(centerX, centerY);

        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        return new Circle(center, radius);
    }
}

