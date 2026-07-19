public class p6 {
// Min Cost Climbing Stairs
    // using dp tabulation dp{ true dp}
        static int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] arr = new int[n];
            arr[0] = cost[0];
            arr[1] = cost[1];
            for(int i = 2; i<cost.length; i++){
                arr[i] = Math.min(arr[i-1],arr[i-2])+cost[i];
            }
            return Math.min(arr[n-1],arr[n-2]);

        }
    public static void main(String[] args) {
        int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(a)); //6
    }
}
