import java.util.Arrays;

public class RadixSort {
    // finds max length of string in arr
    static int getMaxString(String arr[], int n) {
       int max = arr[0].length();
       for (int i = 0; i < n; i++) {
           if (arr[i].length() > max) {
               max = arr[i].length();
           }
       }
       return max;
    }
    static void countSortString(String arr[], int n, int pos) {
        String output[] = new String[n];
        int count[] = new int[256]; // All ASCII characters
        Arrays.fill(count,0);

        // count of occurrences stored in count[]
        for (int i = 0; i < n; i++) {
            int index = pos < arr[i].length() ? arr[i].charAt(pos) : 0;
            count[index]++;
        }
        // change count[i] to contain actual position of digit in output[]
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        //Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = pos < arr[i].length() ? arr[i].charAt(pos) : 0;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        //copy output array to arr[] so it contains sorted numbers according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }
    /* RadixStringSort:
     * Time Complexity: O(d * (n + k))
     * d = the maximum length of the strings
     * n = the number of strings
     * k = the range of the count array (256).
     * Finding the maximum length: O(n)
     * Sorting for each character position: O(d * (n + k)), countSortString is called d times.
     * k is constant (256)
     * thus the overall complexity is O(d * n).
     */
    public static void radixStringSort(String[] arr) {
        int l = arr.length;

        int max = getMaxString(arr, l);

        for (int pos = max - 1; pos >= 0; pos--) {
            countSortString(arr, l, pos);
        }
    }
}
