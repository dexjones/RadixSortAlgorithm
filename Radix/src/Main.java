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
        String arr[] = {"joke", "book", "back", "dig", "desk", "word", "fish", "ward", "dish", "wit", "deed", "fast", "dog", "bend"};

        System.out.println("Unordered string array:\t" + Arrays.toString(arr));
        RadixSort.radixStringSort(arr);
        System.out.println("Sorted string array:\t" + Arrays.toString(arr));

    }
}