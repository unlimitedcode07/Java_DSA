
import java.util.Arrays;

//two sum
public class p8 {
    public static int[] twoSum(int[] nums, int target) {
        int[] x = {0,0};
        int left = 0;
        int right = nums.length-1;
        for(int i = 0; i<nums.length;){
            if(nums[left] + nums[right] == target){
                break;
            }
            if(nums[left] + nums[right] > target){
                right--;
            }
            if(nums[left] + nums[right] < target){
                left--;
            }
            if(right<=left){
                left = -1;
                right = -1;
                break;
            }
        }
        x[0] = left;
        x[1] = right;
        print(x);
        return x;
    }
    public static void print(int[] nums){
        for(int x : nums){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
      int[] arr = {2,7,11,15};
      int target = 13;
        Arrays.sort(arr);
        twoSum(arr,13);
        //0 2


    }
}
