package array;

import java.util.HashMap;

public class TwoSum{
   public static boolean twosum(int[] arr , int target){
    HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
             int complement = target - arr[i];
             if(map.containsKey(complement)){
                 return true;
             }
             map.put(arr[i], i);
        }
        return false;
   }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        boolean result = twosum(arr, target);
        System.out.println("Two numbers sum to " + target + ": " + result);
    }
}
