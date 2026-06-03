public class p23 {
    public static void rotate(int[] nums, int k) {
        int x = k%nums.length;
        int y = nums.length-x;
        System.out.println(x+"ok"+y);
        rotate2(0,nums.length-1,nums);
        rotate2(0,y-1,nums);
        rotate2(y,nums.length-1, nums);


    }

    public static void rotate2(int fir,int end,int[] nums ) {
        int j = end ;
        for(int i= fir; i<nums.length; i++){
            int start = nums[i];
            int last = nums[j];
            nums[i] = last;
            nums[j] = start;
            j--;
            if(i>=j){
                break;
            }
        }
        print(nums);
    }

    public static void print(int[] arr) {
        for(int kp : arr){
            System.out.print(kp+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
    }
}

// clinliest ver

//class Solution {
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n;
//
//        reverse(nums, 0, n - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, n - 1);
//    }
//
//    private void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }
//}
//
