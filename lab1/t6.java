import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sum:");
        int totalBill = scanner.nextInt();
        
        System.out.println("friends:");
        int numberOfFriends = scanner.nextInt();

        if (totalBill <= 0 || numberOfFriends <= 0) {
            System.out.println("number is greater than 0");
        } else {
            double eachPay = (totalBill * 1.1) / numberOfFriends;
            int roundedPay = (int) Math.ceil(eachPay); 
            
            System.out.println("parts of payment for each " + roundedPay);
        }

        scanner.close();
    }
}

