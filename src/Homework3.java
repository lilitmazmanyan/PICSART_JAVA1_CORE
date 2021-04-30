import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, -8, 7, 2, -3, 9, 7, -1, 23, 51, 2, -21, -64};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
