import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of seconds:");
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Electronic clock: " + time);
        
        scanner.close();
    }
}
