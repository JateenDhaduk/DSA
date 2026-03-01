/**
 * Utility class containing a method to check whether an integer array
 * is sorted in non-decreasing (ascending) order.
 */
public class isSorted {
    /**
     * Returns true if the provided array is sorted in ascending order.
     *
     * Definition used:
     * - An empty array and a single-element array are considered sorted.
     * - For all i, arr[i] <= arr[i+1] must hold for the array to be sorted.
     *
     * Note: This method does not perform a null check — callers should ensure
     * the array is non-null if that behavior is required.
     */
    public static boolean IsSorted(int []arr){
        // Trivially sorted if there are fewer than 2 elements.
        if(arr.length == 0 || arr.length == 1) return true;

        // Check each adjacent pair; if any predecessor is greater than its
        // successor, the array is not sorted.
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                // Found a descending adjacent pair -> not sorted.
                return false;
            }
        }

        // No descending pairs found -> array is sorted.
        return true;
    }

    public static void main(String[] args) {
        // Example usage: a small sorted array
        int [] arr =  {2, 4, 5, 6, 7};
        System.out.println(IsSorted(arr));
    }
}
