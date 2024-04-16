import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("the number of strangers?");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("number is greater than 0");
        } else {
            scanner.nextLine(); 

            for (int i = 0; i < count; i++) {
                System.out.println("enter a name" + (i + 1) + ":");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }
        
        scanner.close();
    }
}
