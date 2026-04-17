// missing in arr
//rang is [0,n]
// we have formula to calcuat n natural num ;
// 1 to n is n(n+1)/2
// but for us its from 0 to n ((n-1)((n-1)+1))/2

public class p24 {
    public static int missingNumber(int[] nums) {
         int miss = 0;
         int count = (nums.length)*(nums.length+1)/2;
         int actCount = 0;
         for(int i = 1; i<=nums.length; i++){
            actCount = actCount + nums[i-1];
             System.out.println(count+" ok "+actCount);
         }
         miss = count - actCount;
         return miss;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}

