public class t11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = sum(array);
        System.out.println("sun: " + result);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) { 
                sum += num; 
            }
        }
        return sum; 
    }
}

