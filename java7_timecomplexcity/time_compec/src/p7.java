


// selection sort
//pehele min nikalo or left pe shift karo
// ase hi karte jao


public class p7 {
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
       int[] arr = {3,4,1,4,-3,6,5};
       for(int i = 0; i<arr.length-1; i++){
           selection(arr,i);
       }
       print(arr);

    }
}
