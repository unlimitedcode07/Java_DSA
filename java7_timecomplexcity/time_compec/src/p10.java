//kth smallest element hear we take 3

public class p10 {
    public static void selection(int[] nums,int m){
        int min = Integer.MAX_VALUE;
        int index =m;
        for(int i = m; i<nums.length-1; i++){
            if(nums[i]<=min){
                min = nums[i];
                index = i;
            }
        }
        int temp = nums[m];
        nums[m] = nums[index];
        nums[index] = temp;

    }
    public static void print(int[] nums){
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        for(int i = 0; i<3; i++){
            selection(arr,i);
        }
        print(arr);
        System.out.println();
        System.out.println("3rd smallest: "+arr[2]);

    }
}
