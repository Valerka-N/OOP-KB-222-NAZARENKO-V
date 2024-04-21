package z1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        System.out.println("Enter line 1:");
        Line line1 = Line.inputLine(new Scanner(System.in));

        System.out.println("Enter line 2:");
        Line line2 = Line.inputLine(new Scanner(System.in));

        Point intersectionPoint = line1.intersection(line2);
        System.out.println("Intersection point: " + intersectionPoint);
    }
}
