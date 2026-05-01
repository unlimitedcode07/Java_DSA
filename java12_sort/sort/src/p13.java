//cycle sort  tc:O(n)
// only apply for specific for
// 1 2 3 4 5  1 to n
// 0 1 2 3 4  0 to n
// thinking place array of element at index bases or one base

import java.util.Arrays;

public class p13 {
    public static void main(String[] args) {
       int[] arr = {3,1,5,2,7,0,4,6};
       int i = 0;

       while(i<arr.length){
           if(arr[i] != i){
               int temp1 = arr[arr[i]];
               arr[arr[i]] = arr[i];
               arr[i] = temp1;
           }else{
               i++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
