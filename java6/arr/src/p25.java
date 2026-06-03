// segrate 0s ad once ;
// zeros on left and 1 once in right

public class p25 {
    public static void segrate(int[] nums){
        int start = 0;
         for(int i = 0; i<nums.length; i++){
             if(nums[i] == 1 && start == 0){
                 start = i;
             }if(nums[i] == 0){
                nums[i] = nums[start];
                nums[start] = 0;
             }
         }
    }

    public static void print(int[] arr) {
        for(int y : arr){
            System.out.print(y+" ");
        }
    }

    public static void main(String[] args) {
       int [] arr = {0,0,1,1,0};
       segrate(arr);

    }
}
