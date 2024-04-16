import java.util.Scanner;

public class t3 {
    private static final int password = 123456;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password:");
        int userInput = scanner.nextInt();

        if (userInput == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}
