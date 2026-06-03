//BASIC
//in arr we do this
//Arrays.sort(arr)
//in arrlist we do thsi
//Collections.sort(list)

//sabse acha merg sort he T.C O(logn) // but it take some space o(n)
//ouick sor T.C O(logn) but not always some time n'2 // but it take some space o(logn)
// other like buble selection insertion has 0(n'2)// it take no space O(1)


//sort
// chaeck if arr is sorted

public class p2 {
    public static boolean check( int[] nums){
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int[] arr = {1,0,2,3,5,6};

        System.out.println(check(arr));
    }
}
