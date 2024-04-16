public class t14 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        System.out.println("1:");
        cycleSwap(array1);
        printArray(array1);

        System.out.println("2:");
        int shift = 3;
        cycleSwap(array2, shift);
        printArray(array2);
    }

    public static void cycleSwap(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift == 0) {
            return;
        }

        shift %= array.length;

        for (int s = 0; s < shift; s++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
