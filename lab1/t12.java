import java.util.Arrays;

public class t12 {
    public static void main(String[] args) {
        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(array);
        System.out.println("result: " + Arrays.toString(result));
    }
    
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] checkArray = new boolean[arr.length];
        checkArray[0] = false;
        checkArray[1] = false;
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + arr[i - 2]) {
                checkArray[i] = true;
            } else {
                checkArray[i] = false;
            }
        }
        
        return checkArray;
    }
}

