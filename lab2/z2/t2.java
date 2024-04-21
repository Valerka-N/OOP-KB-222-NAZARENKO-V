package z2;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("origin coordinate 1:");
        Pointt start = Pointt.inputPoint(scanner);
        System.out.println("end coordinate 1:");
        Pointt end = Pointt.inputPoint(scanner);

        Segment segment = new Segment(start, end);

        System.out.println("length: " + segment.length());
        System.out.println("middle: " + segment.middle());

        System.out.println("origin coordinate 2:");
        Pointt start2 = Pointt.inputPoint(scanner);
        System.out.println("end coordinate 2:");
        Pointt end2 = Pointt.inputPoint(scanner);

        Segment segment2 = new Segment(start2, end2);

        Pointt intersection = segment.intersection(segment2);
        if (intersection != null) {
            System.out.println("point of intersection: " + intersection);
        } else {
            System.out.println("do not intersect");
        }

        scanner.close();
    }
}


