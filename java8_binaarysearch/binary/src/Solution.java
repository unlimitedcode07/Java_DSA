
import java.util.*;

public class Solution {
    public static int kthMissing(int[] arr, int k) {
        int a = 0;
        int b = arr.length-1;
        while (a<=b) {
          //  System.out.println(a+" "+b);
            int mid = a+(b-a)/2;
          //  System.out.println("mid:"+mid);
            int val = arr[mid];
            int need = mid+1;
            int miss = val - need;
            if(arr[a] == arr[b]){
                if(miss >= k){
                    int minus = miss- k;
                 //   System.out.println("ai"+b);
                    return arr[mid]-minus-1;
                }else{
                 //   System.out.println("ai5");
                    int plus = k-miss;
                    return arr[mid] + plus;
                }
            }else{
              if(miss >= k){
                  if(b == a+1){
                      b--;
                  }else {
                      b = mid - 1;
                  }
              }else{
                  a = mid + 1;
              }
            }
          //  System.out.println(a+"end of it  "+b);
        }
      return -1;
    }
    public static void main(String[] args) {
      int[] arr = {3, 5, 9, 10, 11, 12};
      int k = 2;
      System.out.println(kthMissing(arr,k));
    }
}