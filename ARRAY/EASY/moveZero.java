public class moveZero {
     public static int[] moveallzeros(int[]arr){
      // This Java code snippet is from a class called `MoveAllZeros` that contains a static method
      // `moveallzeros` which takes an integer array as input and moves all the zeros to the end of the
      // array while maintaining the order of non-zero elements.
        int  i = -1;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]==0){
                i = j;
                break;
            }
        }
        if(i==-1)return arr;
        int j = i+1;
        while(j<arr.length){
            if(arr[j]!= 0){
                swap(i,j,arr);
                i++;
            }
            else{
                j++;
            }
        }
        return arr;
    }
    
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
      public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 3};
        moveallzeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
