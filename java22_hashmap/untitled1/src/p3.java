import java.util.HashSet;

public class p3 {
    static class Solution {
        static int countDistinct(int arr[]) {
            // code here
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i<arr.length; i++){
                set.add(arr[i]);
            }
            return set.size();
        }
    }
    public static void main(String[] args) {

            int[] arr = {1, 2, 2, 3, 4, 4, 5};

            int ans = Solution.countDistinct(arr);

            System.out.println(ans); // 5

    }
}
