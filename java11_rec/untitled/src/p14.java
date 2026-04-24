// gcd ultra promax short

public class p14 {
    public static int gcd(int a, int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 16));
    }
}

//tc haer is 0(2^n)


// asa bhi ho sakta hai ko a bada aye b se to in that case
// [a%b =a if a<b]
// [a%b =a-b if a>b ]
//mental model
//20 % 12 = 8 → gcd(12,8)
//12 % 8 = 4 → gcd(8,4)
//8 % 4 = 0 → gcd(4,0) = 4
