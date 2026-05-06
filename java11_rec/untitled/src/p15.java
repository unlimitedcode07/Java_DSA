// nth fibonacci num
// seq 0 1 [0,1]  this is fix
// 1 (0+1) [2]      / then cal-culat
// 2 (1+1) [3]
// 3 (1+2) [4]      // key is next term is
// 5 (2+3) [5]     // addition of privious 2
// 8 (3+5)  [6]
// 13 (5+8)  [7]
// 21 (8+13)  [8]

//tc = O(2^n)  // 1 2 ko call. 2 4 ko. 4 8 ko. and so on

public class p15 {
    public static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(8)); //21
    }
}
