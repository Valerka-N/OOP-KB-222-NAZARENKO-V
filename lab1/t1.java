import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter:");
            String input = scanner.nextLine();
            
            System.out.print("Hello, ");
            System.out.println(input);
        }
    }
}

