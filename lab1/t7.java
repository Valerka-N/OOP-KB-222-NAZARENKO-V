import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE; 
        
        System.out.println("Enter a sequence of integers (enter 0 to end):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break; 
            }
            if (num > max) {
                max = num; 
            }
        }
        
        System.out.println("Maximum number: " + max);

        scanner.close();
    }
}

