
/**
 * The `RightRotate2` class contains a method `RightRotateByK` that right rotates an integer array by a
 * specified number of positions and demonstrates this functionality in the `main` method.
 */public class RoateArray {
    /**
    * The function `RightRotateByK` rotates an array to the right by `k` positions.
    * 
    * @param arr The `arr` parameter is an integer array that you want to right rotate by `k`
    * positions.
    * @param k The parameter `k` in the `RightRotateByK` method represents the number of positions by
    * which the elements in the array `arr` should be right rotated.
    */
     public static void RightRotateByK(int[] arr,int k){
            int n = arr.length;
            k = k%n;
            reverse.reverse(0, n-1, arr);
            reverse.reverse(0, k-1, arr);
            reverse.reverse(k, n-1, arr);
    }
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5,6,7};
        RightRotateByK(arr,2);
        for(int num :arr){
            System.out.println(num);
        }
    }
}
