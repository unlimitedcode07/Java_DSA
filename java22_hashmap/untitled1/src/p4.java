import java.util.HashSet;

public class p4 {
    static class Solution {
        static boolean twoSum(int arr[], int target) {
            HashSet<Integer> set = new HashSet<>();
            for(int el : arr){
                int a = target-el;
                if(set.contains(a)) return true;
                set.add(el);
            }
            return false;

        }
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int t = 0;
        boolean ans = Solution.twoSum(arr,t);

        System.out.println(ans); // 5
    }
}
