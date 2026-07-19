
//  House Robber

public class p5 {
    // tabulation dp{ true dp}
        public static int rob(int[] nums) {
            if(nums.length == 1 ) return nums[0];
            if(nums.length == 2) return Math.max(nums[0],nums[1]);
            else{
                int[] arr = new int[nums.length+1];
                arr[0] = 0;
                arr[1] = nums[0];
                for(int i = 2; i<=nums.length; i++){
                    arr[i] = Math.max((nums[i-1]+arr[i-2]),arr[i-1]);
                }
                return arr[nums.length];
            }
        }
    public static void main(String[] args) {
        int[] nums = {2 , 1, 1, 2};
        System.out.println(rob(nums));   // 4
    }
}
