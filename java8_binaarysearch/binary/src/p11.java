//Q: Kth missing positive number in a sorted array

public class p11 {
    public static int miss(int[] arr, int m){
         int i = 0;
         int j = arr.length-1;
         while(i<=j){
             int mid = i +(j-i)/2;
             int op = arr[mid]-(mid+1);
             if(op>= m){
                 j= mid -1;
             }else{
                 i = mid +1;
             }
         }return j+1+m;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 10, 11, 12};
        int next = 2;
        System.out.println(miss(arr,next));
    }
}
