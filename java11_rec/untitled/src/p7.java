import java.util.Scanner;

// factorial of num
// 5! = 5*4*3*2*1
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();


        System.out.println(fact(op));
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int ans = n * fact(n-1);
        return ans;
    }// time complecity 0(n) hai lekin fast for loop se hi hoga
}// tc = max no of xcall in cell stack
// space = no of call
