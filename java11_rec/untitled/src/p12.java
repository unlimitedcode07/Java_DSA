//GCD of 2 num
//  |
//  -> greatest common divisior
//  -> highest comon factor

//eg 12&16
// 12 has 1,2,3,4,6,12
// 16 has 1,2,4,8,16
// so gcd is 4

public class p12 {
    public static int gcd(int a,int b, int i,int ans){
       if(a<i) return ans;
       if(a%i == 0 && b%i ==0){
           ans = i;
       }
       return gcd(a,b,i+1,ans);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,16,1,1));
    }
}
