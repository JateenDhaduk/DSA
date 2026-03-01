public class secondLargestElement {
     public static int FindSecondlargestElement(int [] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
      // This part of the code is iterating through the elements of the array `arr`. For each element
      // at index `i`, it compares the element with the current maximum value (`max`). If the element
      // is greater than the current maximum value, it updates the second maximum value (`smax`) to be
      // the previous maximum value (`max`) and updates the maximum value to be the current element in
      // the array. This way, it keeps track of the second largest element in the array.
        for(int i = 0;i<arr.length;i++){
                if(arr[i]>max){
                    smax = max;
                    max = arr[i];
                }
                else if(arr[i]>smax && arr[i]!=max){
                    smax = arr[i];
                }
        }
             return smax;
     }
      public static void main(String[] args) {
        int [] arr =  {2, 4, 6, 5, 3, 1};
        System.out.println(FindSecondlargestElement(arr));
    }
}


