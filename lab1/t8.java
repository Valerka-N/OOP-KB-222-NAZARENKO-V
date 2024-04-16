import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0; 
        
        System.out.println("Enter a sequence of integers (enter 0 to end)");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break; 
            }
            sum += num;
            count++;
        }
        
        if (count == 0) {
            System.out.println("eror");
        } else {
            double average = (double) sum / count; 
            System.out.println("Average value: " + average);
        }

        scanner.close();
    }
}

