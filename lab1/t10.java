public class t10 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15};
        int maxValue = max(array);
        System.out.println("max: " + maxValue);
    }

    public static int max(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        return max;
    }
}

