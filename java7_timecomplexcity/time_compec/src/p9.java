//
//Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and
//return the list in sorted order.
//Duplicates may be there in the output list.
//
//Example:
//
//Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
//Output: 2 2 3
//Explanation: The common elements in sorted order are [2, 2, 3]
//Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
//Output: 3 7 9
//Explanation: The common elements in sorted order are [3, 7, 9]
//Constraints:
//
//        1 ≤ a.size(), b.size() ≤ 105
//        1 ≤ a[i], b[i] ≤ 105

import java.util.ArrayList;
import java.util.Arrays;

public class p9 {
    public static ArrayList<Integer> common(int a[], int[] b,ArrayList<Integer> arr){
         int i = 0;
         int j = 0;
         while(i<a.length && j<b.length){
             System.out.println("i: "+i+"j: "+j);
             if(a[i] == b[j]){
                 arr.add(a[i]);
                 i++;
                 j++;
             }else if(a[i]> b[j]){
                 j++;
             }else{
                 i++;
             }

         }
         return arr;

    }


    public static void main(String[] args) {
       int [] arr1 = { 3,4,2,2,4};
       int [] arr2 = {3,2,2,7};
        ArrayList<Integer> arr = new ArrayList<>();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       common(arr1,arr2,arr);
       System.out.println(arr);
      // [2, 2, 3]
    }
}
