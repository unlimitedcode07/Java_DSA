public class p13 {
    public static void main(String[] args) {
        System.out.println(gcd(12, 16));  // 4
    }
    private static int gcd(int a, int b, int i, int ans) {
        if (i > a) return ans;

        if (a % i == 0 && b % i == 0) {
            ans = i;
        }

        return gcd(a, b, i + 1, ans);
    }
    public static int gcd(int a, int b) {
        return gcd(a, b, 1, 1);   // default values handled here
    }


//12/16
}
