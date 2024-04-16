import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("the number of feet a snail climbs in a day");
        int a = scanner.nextInt();
        
        System.out.println("the number of feet a snail slides down in a night");
        int b = scanner.nextInt();
        
        System.out.println("the height of the tree in feet");
        int h = scanner.nextInt();
        
        if (a <= b) {
            System.out.println("Impossible");
        } else { 
            int days = (h - b - 1) / (a - b) + 1;
            System.out.println("Number of days to reach the top of the tree: " + days);
        }

        scanner.close();
    }
}

