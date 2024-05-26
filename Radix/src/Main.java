/*
Author: Dexter Jones

Implement radix sort algorithm.
Analyze algorithm in Big-Oh notation and provide the appropriate analysis.
Analyze the algorithm by documenting the steps taken when radix sort sorts
the following array of Integer objects: 783 99 472 182 264 543 356 295 692 491 94
 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int arr[] = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};

        System.out.println("Unordered array:\t" + Arrays.toString(arr));
        RadixSort.radixIntSort(arr);
        System.out.println("Sorted array:\t\t" + Arrays.toString(arr));
    }
}