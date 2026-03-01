/**
 * The LargestElement class contains a method to find the largest element in an integer array and a
 * main method to test it.
 */

public class largestElement {
    public static int FindlargestElement(int [] arr){
        int max = arr[0];
        for(int i = 1;i<=arr.length-1;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
        }
        return max;
     }
    public static void main(String[] args) {
        int [] arr =  {2, 4, 6, 5, 3, 1};
        System.out.println(FindlargestElement(arr));
    }
}
