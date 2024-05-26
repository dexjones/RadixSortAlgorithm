import java.util.Arrays;

public class RadixSort {
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count,0);

        // count of occurrances stored in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        // change count[i] to contain actual position of digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        //Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] /exp) % 10]--;
        }

        //copy output array to arr[] so it contains sorted numbers according to current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }
    public static void radixIntSort(int[] arr) {
        int l = arr.length;

        int max = getMax(arr, l);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, l, exp);
        }
    }
}
