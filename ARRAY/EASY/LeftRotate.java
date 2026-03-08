package array;

public class LeftRotate {
    public static void lelfrotate(int []arr){
        int temp = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length -1]  = temp;
    }
      public static void main(String[] args) {
        int [] arr =  {2, 4, 5, 6, 7};
        lelfrotate(arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
