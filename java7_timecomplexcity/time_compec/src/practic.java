import java.util.*;
public class practic {
    static void print(int[] arr){
        System.out.println();
       for(int el : arr){
           System.out.print(el+" ");
       }
    }
    static void inser(int[] arr){
       for(int i = 1; i<arr.length; i++){
           int a = i;
           while(i>0){
               if(arr[i-1]>arr[i]){
                   int temp = arr[i-1];
                   arr[i-1] = arr[i];
                   arr[i] = temp;
               }
              i--;
           }
           i = a;
       }
    }
    //{45,2,7,4,9,1,9,5,7};
    public static void main(String[] args) {
        int[] arr = {45,2,7,4,9,1,9,5,7};
        inser(arr);
        print(arr);
    }
}
